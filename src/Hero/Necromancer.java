package labTenth.secondTask.Hero;

import labTenth.secondTask.Item.Item;
import labTenth.secondTask.Item.ManaPotion;
import labTenth.secondTask.Weapon.Staff;
import labTenth.secondTask.Weapon.Weapon;

public class Necromancer extends Hero {
    private final int MAX_MANA = 100;
    private int mana;
    private int spellPower = 1;

    public Necromancer(String name, int health, int mana) {
        super(name, health);
        this.mana = mana > MAX_MANA ? MAX_MANA : mana;
    }

    public boolean action(Player player, int distance) {
        if (weapon.getDistance() >= distance) {
            for (Item item : items) {
                while (mana > 0) {
                    if (weapon instanceof Staff){
                        player.damage(weapon.getPower());
                    } else if (distance<=1){
                        player.damage(1);
                    }
                    mana-=spellPower;
                    return true;
                } if (item instanceof ManaPotion && item.getItemsCount() >= 1) {
                    mana += item.use();
                }
            }
        }
        return false;
    }

    public boolean change(Weapon weapon) {
        if (weapon instanceof Staff) {
            if (this.weapon == null) {
                this.weapon = weapon;
                return true;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public boolean useItem(int slot) {
        return super.useItem(slot);
    }
}
