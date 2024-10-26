package labTenth.secondTask.Hero;

import labTenth.secondTask.Armor.Armor;
import labTenth.secondTask.Item.HealthPotion;
import labTenth.secondTask.Item.Item;
import labTenth.secondTask.Weapon.Weapon;

public abstract class Hero implements Player, Healthy, Equipment, Inventory {
    protected String username;
    protected int health;
    protected Weapon weapon;
    protected Armor[] clothes = new Armor[CLOTHES_COUNT];
    protected Item[] items = new Item[ITEMS_COUNT];
    public Hero(String username, int health) {
        if (username != null && !username.isBlank()) {
            this.username = username;
        } else {
            throw new IllegalArgumentException("This name cannot be used");
        }
        if (health > MAX_HEALTH || health < 0) {
            throw new IllegalArgumentException("This amount of health cannot be used");
        } else {
            this.health = health;
        }
    }

    private void loseHealth(int damage) {
        health -= damage;
    }

    @Override
    public void dress(Armor armor) {
        int position = armor.getPosition();
        if (clothes[position - 1] == null) {
            clothes[position - 1] = armor;
        }
    }
    public String getUsername(){
        return username;
    }

    @Override
    public int damage(int damage) {
        for (Armor armor : clothes) {
            if (armor != null) {
                loseHealth(armor.destroyBy(damage));
                if (health < 0) {
                    health = 0;
                }
                return health;
            }
        }
        loseHealth(damage);
        if (health < 0) {
            health = 0;
        }
        return health;
    }

    @Override
    public boolean isDied() {
        return health == 0;
    }

    @Override
    public void recoverHealth(int heal) {
        if (health + heal <= 100) {
            health += heal;
        } else {
            health = 100;
        }
    }

    @Override
    public boolean putInto(Item item, int slot) {
        if (slot < 1 || slot > ITEMS_COUNT) {
            return false;
        } else if (items[slot - 1] == null) {
            items[slot - 1] = item;
            return true;
        }
        return true;
    }

    @Override
    public boolean useItem(int slot) {
        if (items[slot - 1] == null) {
            return false;
        } else if (items[slot - 1] instanceof HealthPotion) {
            recoverHealth(items[slot - 1].use());
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean action(Player player, int distance) {
        if (weapon.getDistance() >= distance) {
            player.damage((int) (1 * weapon.getPower()));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public abstract boolean change(Weapon weapon);

    @Override
    public String toString() {
        String weaponString = (weapon != null) ? weapon.toString() : "no";
        String inventoryString = "";
        for (Item item : items) {
            if (item != null) {
                inventoryString += item.toString();
            }
        }
        String inventory = inventoryString.isEmpty() ? "no" : inventoryString;
        return String.format("%s: username: %s, health: %d, weapon: %s, inventory: %s", this.getClass().getSimpleName(), username, health, weaponString, inventory);
    }
}
