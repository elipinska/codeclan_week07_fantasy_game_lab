import Castle.Room;
import Castle.TreasureRoom;
import Surprises.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    private TreasureRoom room1;

    @Before
    public void before() {
        room1 = new TreasureRoom("Great Hall", Treasure.CHOCOLATE);
    }


    @Test
    public void roomHasName(){
        assertEquals("Great Hall",room1.getName());
    }

    @Test
    public void roomHasTreasure(){
        assertEquals(Treasure.CHOCOLATE,room1.getTreasure());
    }
}
