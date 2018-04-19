import CombatItems.HealingTool;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric1;

    @Before
    public void before() {
        cleric1 = new Cleric("Dulgren", HealingTool.POTION);

    }

    @Test
    public void hasName() {
        assertEquals("Dulgren", cleric1.getName());
    }

    @Test
    public void hasHp() {
        assertEquals(25, cleric1.getHp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, cleric1.getLevel());
    }

    @Test
    public void hasEmptyPack() {
        assertEquals(0, cleric1.getPack().size());
    }

    @Test
    public void canHeal() {
        assertEquals(5, cleric1.heal());
    }



}