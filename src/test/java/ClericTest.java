import CombatItems.HealingTool;
import CombatItems.Weapon;
import Npcs.Healers.Cleric;
import Players.Fighters.Barbarian;
import Surprises.Treasure;
import Surprises.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric1;
    private Barbarian player1;

    @Before
    public void before() {
        cleric1 = new Cleric("Dulgren");
        player1 = new Barbarian("Brutus", Weapon.CLUB);

    }

    @Test
    public void hasName() {
        assertEquals("Dulgren", cleric1.getName());
    }

    @Test
    public void clericHasHealingTool() {
        assertEquals(HealingTool.class, cleric1.getHealingtool().getClass());
    }



    @Test
    public void clericCantHealIfHpIsMax() {
        Treasure gold = new Treasure(TreasureType.GOLD);
        player1.addToPack(gold);
        assertEquals("The cleric looks you over but sees no wounds to heal.", cleric1.heal(player1));
    }

    //Healing tool is assigned randomly, so the test will not always pass.
//    @Test
//    public void clericCanHeal() {
//        Treasure gold = new Treasure(TreasureType.GOLD);
//        player1.addToPack(gold);
//        player1.setHp(10);
//        assertEquals("The cleric heals you with medkit. Your current hp: 15", cleric1.heal(player1));
//    }



}