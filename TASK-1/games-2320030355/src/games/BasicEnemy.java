package games;

public class BasicEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("Basic attack!");
    }

    @Override
    public int getHealth() {
        return 100;
    }
}
