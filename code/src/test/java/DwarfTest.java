import CombatItems.Weapon;
import Players.Fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf1;

    @Before
    public void before() {
        dwarf1 = new Dwarf("Carlos", Weapon.AXE);

    }

    @Test
    public void hasName() {
        assertEquals("Carlos", dwarf1.getName());
    }

    @Test
    public void hasHp() {
        assertEquals(25, dwarf1.getHp());
    }

    @Test
    public void hasLevel() {
        assertEquals(1, dwarf1.getLevel());
    }

    @Test
    public void hasEmptyPack() {
        assertEquals(0, dwarf1.getPack().size());
    }

    //Damage has been randomised, so the test below won't always pass
//    @Test
//    public void canFight() {
//        assertEquals(3, dwarf1.dealDamage());
//    }

    @Test
    public void dwarfHasBattleCry() {
        assertEquals("\"Baruk Khazâd! Khazâd ai-mênu!\"", dwarf1.battleCry());
    }
}
