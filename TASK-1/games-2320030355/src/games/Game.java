package games;

public class Game {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        gameState.setLevel(1);

        // Create enemy based on current level
        Enemy enemy = EnemyFactory.createEnemy(gameState.getLevel());
        Weapon weapon = WeaponFactory.createWeapon();

        System.out.println("Level: " + gameState.getLevel());
        System.out.println("Using weapon:");
        weapon.use();
        System.out.println("Enemy encountered:");
        enemy.attack();
    }
}
