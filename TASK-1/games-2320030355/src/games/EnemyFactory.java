package games;

public class EnemyFactory {
	public static Enemy createEnemy(int level) {
        if (level == 1) {
            return new BasicEnemy();
        }
       
        return new BasicEnemy(); 
    }
}
