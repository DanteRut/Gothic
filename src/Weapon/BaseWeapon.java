package labTenth.secondTask.Weapon;

public abstract class BaseWeapon implements Weapon {
    protected int power;

    public BaseWeapon(int power) {
        if (power >= MIN_VALUE && power <= MAX_VALUE) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("The weapon cannot have these parameters");
        }
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public abstract int getDistance();

    @Override
    public String toString() {
        return String.format("%s, power: %f, distance: %d", this.getClass().getSimpleName(), power, getDistance());
    }
}
