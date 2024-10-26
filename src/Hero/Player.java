package labTenth.secondTask.Hero;

public interface Player {
    String getUsername();

    int damage(int damage);

    boolean action(Player player, int distance);
}
