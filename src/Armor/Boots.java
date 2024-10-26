package labTenth.secondTask.Armor;

import labTenth.secondTask.Armor.BaseArmor;

public class Boots extends BaseArmor {
    private final int BOOTS_POSITION = 1;
    public Boots(int durability){
        super(durability);
    }

    @Override
    public int getPosition() {
        return BOOTS_POSITION;
    }
}
