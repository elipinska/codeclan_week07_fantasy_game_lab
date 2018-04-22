import CombatItems.Weapon;
import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight1;

    @Before
    public void before() {
        knight1 = new Knight("Hero Protaginist", Weapon.SWORD);

    }

    @Test
    public void hasName() {
        assertEquals("Hero Protaginist", knight1.getName());
    }

    @Test
    public void hasHp() {
        assertEquals(25, knight1.getHp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, knight1.getLevel());
    }

    @Test
    public void hasEmptyPack() {
        assertEquals(0, knight1.getPack().size());
    }


    @Test
    public void canFight() {
        assertEquals(10, knight1.dealDamage());
    }

    @Test
    public void knightHasBattleCry() {
        assertEquals("\"For king and country!\"", knight1.battleCry());
    }
}
