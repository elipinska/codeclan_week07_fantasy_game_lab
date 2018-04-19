import CombatItems.Weapon;
import Players.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian1;

    @Before
    public void before() {
        barbarian1 = new Barbarian("Jemma", Weapon.CLUB);

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
        assertEquals(2, barbarian1.dealDamage());
    }
}
