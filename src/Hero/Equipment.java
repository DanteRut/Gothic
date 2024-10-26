package labTenth.secondTask.Hero;

import labTenth.secondTask.Armor.Armor;
import labTenth.secondTask.Weapon.Weapon;

public interface Equipment {
    int CLOTHES_COUNT = 3;

    boolean change(Weapon weapon);

    void dress(Armor armor);
}
