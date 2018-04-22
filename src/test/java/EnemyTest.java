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
        assertEquals("a goblin", enemy1.getType());
        assertEquals("an ogre", enemy2.getType());
    }

    @Test
    public void enemyHasHP() {
        assertEquals(8, enemy1.getHp());
        assertEquals(12, enemy2.getHp());
    }



}
