package labTenth.secondTask.Item;

public class Potions extends BaseItem{
    public Potions(int count){
        super(count);
    }
    public int use() {
        if (!isUsed()) {
            count--;
            return 100;
        } else {
            return 0;
        }
    }
}
