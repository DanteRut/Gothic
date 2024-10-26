package labTenth.secondTask.Hero;

import labTenth.secondTask.Item.Item;

public interface Inventory {
    int ITEMS_COUNT = 5;

    boolean putInto(Item item, int slot);

    boolean useItem(int slot);
}
