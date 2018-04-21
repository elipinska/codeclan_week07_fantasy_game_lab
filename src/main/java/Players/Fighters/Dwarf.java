package Players.Fighters;

import CombatItems.Weapon;

public class Dwarf extends Fighter {

    public Dwarf(String name, Weapon weapon) {
        super(name, weapon);
    }

    public String battleCry() {
        return "\"Baruk Khazâd! Khazâd ai-mênu!\"";
    }
}
