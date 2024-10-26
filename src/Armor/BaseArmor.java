package labTenth.secondTask.Armor;

import labTenth.secondTask.Armor.Armor;

public abstract class BaseArmor implements Armor {
    protected int durability;

    public BaseArmor(int durability) {
        if (durability >= MIN_VALUE && durability <= MAX_VALUE) {
            this.durability = durability;
        } else {
            throw new IllegalArgumentException("The armor cannot have these parameters");
        }
    }

    public boolean isBroken() {
        return durability == 0;
    }

    @Override
    public int destroyBy(int damage) {
        int remainDurability = durability - damage;
        if (remainDurability <= 0) {
            durability = 0;
            return Math.abs(remainDurability);
        } else {
            durability = remainDurability;
            return 0;
        }

    }

    @Override
    public abstract int getPosition();

    public String toString() {
        return String.format("%d: %s, durability: %d, isBroken: %b", getPosition(), this.getClass().getSimpleName(), durability, isBroken());
    }
}
