package labTenth.secondTask.Weapon;

public class Staff extends BaseWeapon{
    private final int STAFF_DISTANCE = 3;
    public Staff(int power){
        super(power);
    }
    @Override
    public int getDistance() {
        return STAFF_DISTANCE;
    }

    @Override
    public int getPower() {
        return power;
    }
}
