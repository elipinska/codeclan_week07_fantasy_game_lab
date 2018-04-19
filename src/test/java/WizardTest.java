import CombatItems.Spell;
import CombatItems.Weapon;
import Players.Mages.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard1;

    @Before
    public void before() {
        wizard1 = new Wizard("Gandalf", Spell.FIREBALL);

    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", wizard1.getName());
    }

    @Test
    public void hasHp() {
        assertEquals(25, wizard1.getHp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, wizard1.getLevel());
    }

    @Test
    public void hasEmptyPack() {
        assertEquals(0, wizard1.getPack().size());
    }

    @Test
    public void canCastSpell() {
        assertEquals(7, wizard1.dealSpellDamage());
    }


}