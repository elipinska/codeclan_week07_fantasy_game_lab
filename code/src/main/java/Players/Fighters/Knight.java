package Players.Fighters;

import CombatItems.Weapon;

public class Knight extends Fighter {

    public Knight(String name, Weapon weapon) {
        super(name, weapon);
    }

    public String battleCry() {
        return "\"For king and country!\"";
    }
}


