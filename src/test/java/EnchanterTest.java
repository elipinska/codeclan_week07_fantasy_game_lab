import CombatItems.Spell;
import CombatItems.Weapon;
import Players.Mages.Enchanter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnchanterTest {

    private Enchanter enchanter1;

    @Before
    public void before() {
        enchanter1 = new Enchanter("Merla", Spell.ICE_BLAST);

    }

    @Test
    public void hasName() {
        assertEquals("Merla", enchanter1.getName());
    }

    @Test
    public void hasHp() {
        assertEquals(25, enchanter1.getHp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, enchanter1.getLevel());
    }

    @Test
    public void hasEmptyPack() {
        assertEquals(0, enchanter1.getPack().size());
    }


    @Test
    public void canCastSpell() {
        assertEquals(4, enchanter1.dealSpellDamage());
    }

}