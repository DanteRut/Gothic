package labTenth.secondTask.Armor;

import labNine.firstTask.Pupils;

public interface Armor {
    public int MIN_VALUE = 5;
    public int MAX_VALUE = 50;
    public boolean isBroken();
    public int destroyBy(int damage);
    public int getPosition();
}
