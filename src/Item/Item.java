package labTenth.secondTask.Item;

public interface Item {
    int MIN_VALUE = 1;
    int MAX_VALUE = 10;

    int use();

    boolean isUsed();
    int getItemsCount();

}
