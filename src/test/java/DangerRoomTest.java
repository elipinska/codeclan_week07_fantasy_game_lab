import Castle.Room;
import Castle.DangerRoom;
import Surprises.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DangerRoomTest {

    private DangerRoom room1;
    private Enemy enemy1;

    @Before
    public void before() {
        enemy1 = new Enemy("Michelle", "Necromancer", 10, 20);
        room1 = new DangerRoom("Dungeon", enemy1);
    }


    @Test
    public void roomHasName(){
        assertEquals("Dungeon",room1.getName());
    }

    @Test
    public void roomHasDanger(){
        assertEquals(enemy1, room1.getEnemy());
    }
}

