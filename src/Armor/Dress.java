package labTenth.secondTask.Armor;

import labTenth.secondTask.Armor.BaseArmor;

public class Dress extends BaseArmor {
    private final int DRESS_POSITION = 2;
    public Dress(int durability){
        super(durability);
    }

    @Override
    public int getPosition() {
        return DRESS_POSITION;
    }
}
