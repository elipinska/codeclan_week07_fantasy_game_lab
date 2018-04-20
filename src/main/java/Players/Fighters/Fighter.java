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

    public String attack() {
        ISurprise surprise = getCurrentRoom().getSurprise();
        if(surprise.isEnemy()) {
            ((Enemy) surprise).setHp(((Enemy) surprise).getHP() - dealDamage());
            return "You've dealt a nasty blow!";
        } else {
            return "What are you swinging your weapon for? There's no one here!";
        }
    }



}
