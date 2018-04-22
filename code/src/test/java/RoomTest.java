import Castle.Room;
import Surprises.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private ISurprise surprise1;
    private ISurprise surprise2;
    private Room room1;
    private Room room2;

    @Before
    public void before() {
        surprise1 = new Treasure(TreasureType.GEMS);
        surprise2 = new Enemy(EnemyType.OGRE);
        room1 = new Room("Great Hall", surprise1);
        room2 = new Room("Kitchen", surprise2);
    }

    @Test
    public void roomHasName() {
        assertEquals("Great Hall", room1.getName());
        assertEquals("Kitchen", room2.getName());
    }

    @Test
    public void roomHasEmptyArrayOfOccupants() {
        assertEquals(0, room1.getPlayerOccupants().size());          assertEquals(0, room2.getPlayerOccupants().size());
    }

    @Test
    public void roomHasSurpriseEnemyOrTreasure() {
        assertEquals(Enemy.class, room2.getSurprise().getClass());
        assertEquals(Treasure.class, room1.getSurprise().getClass());
    }
}
