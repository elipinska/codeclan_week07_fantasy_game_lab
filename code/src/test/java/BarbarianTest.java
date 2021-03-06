import Castle.Room;
import CombatItems.Weapon;
import Players.Fighters.Barbarian;
import Surprises.Enemy;
import Surprises.EnemyType;
import Surprises.Treasure;
import Surprises.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian1;
    private Room room1;
    private Treasure treasure;
    private Enemy enemy;
    private Room room2;

    @Before
    public void before() {
        barbarian1 = new Barbarian("Jemma", Weapon.CLUB);
        treasure = new Treasure(TreasureType.CHOCOLATE);
        enemy = new Enemy(EnemyType.GOBLIN);
        room1 = new Room("Bedchamber", treasure);
        room2 = new Room("Hallway", enemy);
    }


    @Test
    public void hasName() {
        assertEquals("Jemma", barbarian1.getName());
    }

    @Test
    public void hasHp() {
        assertEquals(25, barbarian1.getHp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, barbarian1.getLevel());
    }

    @Test
    public void hasEmptyPack() {
        assertEquals(0, barbarian1.getPack().size());
    }

    @Test
    public void canFight() {
        assertEquals(6, barbarian1.dealDamage());
    }

    @Test
    public void barbarianCanEnterRoom() {
        barbarian1.enterRoom(room1);
        assertEquals(1, room1.getPlayerOccupants().size());
        assertEquals(room1, barbarian1.getCurrentRoom());
    }

    @Test
    public void barbarianCanSearchRoom__FindsTreasure() {
        barbarian1.enterRoom(room1);
        assertEquals("You have found a locked wooden chest!", barbarian1.searchRoom());
    }

    @Test
    public void barbarianCanSearchRoom__FindsEnemy() {
        barbarian1.enterRoom(room2);
        assertEquals("You hear something moving in the corner of the room... \n", barbarian1.searchRoom());
    }

    @Test
    public void barbarianCanCollectTreasure() {
        barbarian1.enterRoom(room1);
        assertEquals("You've collected some chocolate.\n", barbarian1.collectTreasure());
        assertEquals(1, barbarian1.getPack().size());
    }

    @Test
    public void barbarianCantCollectTreasureIfTheresNone() {
        barbarian1.enterRoom(room2);
        assertEquals("There's no treasure in this room!", barbarian1.collectTreasure());
        assertEquals(0, barbarian1.getPack().size());
    }

    //Damage has been randomised, so the result will be different every time
//    @Test
//    public void barbarianCanFightEnemy() {
//        barbarian1.enterRoom(room2);
//        assertEquals("You've dealt a nasty blow!", barbarian1.attack(enemy));
//        assertEquals(7, ((Enemy) room2.getSurprise()).getHp());
//    }


    @Test
    public void barbarianHasBattleCry() {
        assertEquals("\"AAAAAGH!\"", barbarian1.battleCry());
    }

    @Test
    public void babarianCanPayForHealing__OneGoldTreasureShouldRemainInPack() {
        Treasure treasure1 = new Treasure(TreasureType.GOLD);
        Treasure treasure2 = new Treasure(TreasureType.GOLD);
        barbarian1.addToPack(treasure1);
        barbarian1.addToPack(treasure2);
        assertEquals(true, barbarian1.canPayForHealing());
        assertEquals(1, barbarian1.getPack().size());
    }
}
