package Players.Fighters;

import CombatItems.Weapon;
import Players.Player;

public abstract class Fighter extends Player implements IFight {

    private Weapon weapon;

    public Fighter(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int dealDamage() {
        return getWeapon().getDamage();
    }
}
