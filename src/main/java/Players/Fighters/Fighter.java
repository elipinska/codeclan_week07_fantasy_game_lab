package Players.Fighters;

import CombatItems.Weapon;
import Players.Player;
import Surprises.Enemy;
import Surprises.ISurprise;

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

    public String attack(Enemy enemy) {
        (enemy).setHp((enemy).getHp() - dealDamage());
        return "You've dealt a nasty blow!";
    }



}
