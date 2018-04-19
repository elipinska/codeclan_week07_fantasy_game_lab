import Castle.DangerRoom;
import Castle.Room;
import Castle.Castle;
import Castle.TreasureRoom;
import CombatItems.Weapon;
import Players.Fighters.Dwarf;
import Players.Player;
import Surprises.Enemy;
import Surprises.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CastleTest {

    Castle castle;
    Room room1;
    Room room2;
    Enemy enemy1;
    Player player1;

    @Before
    public void before(){
        enemy1 = new Enemy("Michelle", "Necromancer", 10, 20);
        room1 = new TreasureRoom("Kitchen", Treasure.GEMS);
        room2 = new DangerRoom("Bedchamber", enemy1);
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.addAll(Arrays.asList(room1, room2));
        castle = new Castle(roomList);
        player1 = new Dwarf("Carlos", Weapon.AXE);

    }

    @Test
    public void castleHasTwoRoomsOfDifferentTypes() {
        assertEquals(2, castle.getRoomList().size());
        assertEquals(TreasureRoom.class, castle.getRoomList().get(0).getClass());
        assertEquals(DangerRoom.class, castle.getRoomList().get(1).getClass());
    }

    @Test
    public void player1EntersRoom1() {
        player1.enterRoom(room1);
        assertEquals(1, room1.getOccupants().size());
    }

    @Test
    public void player1CanCollectTreasure() {
        player1.enterRoom(room1);
        player1.searchForTreasure(room1);
        assertEquals(1, player1.getPack().size());
        assertEquals(Treasure.GEMS, player1.getPack().get(0));
    }

    @Test
    public void player1CanFight(){
        player1.enterRoom(room2);
        player1.attack(enemy1);
        assertEquals(17, enemy1.getHP());
    }

}

