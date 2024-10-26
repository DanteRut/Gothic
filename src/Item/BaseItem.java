package labTenth.secondTask.Item;

public abstract class BaseItem implements Item{
    protected int count;

    public BaseItem(int count) {
        if (count < MIN_VALUE || count > MAX_VALUE) {
            throw new IllegalArgumentException("The entered value does not match the condition");
        } else {
            this.count = count;
        }
    }

    @Override
    public boolean isUsed() {
        return count <= 0;
    }

    @Override
    public String toString() {
        return String.format("%s, count: %d, isUsed: %b. ", this.getClass().getSimpleName(), count, isUsed());
    }
    public int getItemsCount(){
        return count;
    }

}
