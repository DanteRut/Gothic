package labTenth.secondTask.Hero;

public interface Healthy {
    int MAX_HEALTH = 100;

    boolean isDied();

    void recoverHealth(int heal);
}
