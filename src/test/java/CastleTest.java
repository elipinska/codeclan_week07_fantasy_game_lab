import Castle.Room;
import Castle.Castle;
import CombatItems.Weapon;
import Players.Fighters.Dwarf;
import Players.Player;
import Surprises.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CastleTest {

    Castle castle;
    Room treasureRoom1;
    Room dangerRoom1;
    Enemy enemy1;
    Player player1;
    ISurprise surprise1;
    ISurprise surprise2;

    @Before
    public void before(){
        surprise1 = new Treasure(TreasureType.GOLD);
        surprise2 = new Enemy(EnemyType.OGRE);
        treasureRoom1 = new Room("Kitchen", surprise1);
        dangerRoom1 = new Room("Bedchamber", surprise2);
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.addAll(Arrays.asList(treasureRoom1, dangerRoom1));
        castle = new Castle(roomList);
        player1 = new Dwarf("Carlos", Weapon.AXE);

    }

    @Test
    public void CastleHasTwoRooms() {
        assertEquals(2, castle.getRoomList().size());
    }


}

