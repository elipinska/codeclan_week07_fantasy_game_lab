import Surprises.Enemy;
import Surprises.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy1;
    private Enemy enemy2;

    @Before
    public void before() {
        enemy1 = new Enemy(EnemyType.GOBLIN);
        enemy2 = new Enemy(EnemyType.OGRE);

    }

    @Test
    public void enemyHasType() {
        assertEquals("goblin", enemy1.getType());
        assertEquals("ogre", enemy2.getType());
    }

    @Test
    public void enemyHasHP() {
        assertEquals(6, enemy1.getHP());
        assertEquals(10, enemy2.getHP());
    }



}
