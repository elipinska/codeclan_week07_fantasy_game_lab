import Surprises.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy1;
    private Enemy enemy2;

    @Before
    public void before() {
        enemy1 = new Enemy("Michelle", "Necromancer", 10, 20);
        enemy2 = new Enemy("Alex", "Ogre", 5, 10);

    }

    @Test
    public void enemyHasName() {
        assertEquals("Michelle", enemy1.getName());
        assertEquals("Alex", enemy2.getName());
    }

    @Test
    public void enemyHasType() {
        assertEquals("Necromancer", enemy1.getType());
        assertEquals("Ogre", enemy2.getType());
    }


    @Test
    public void enemyHasDamage() {
        assertEquals(10, enemy1.getDamage());
        assertEquals(5, enemy2.getDamage());
    }


}
