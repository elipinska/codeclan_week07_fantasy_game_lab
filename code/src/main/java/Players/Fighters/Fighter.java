package Players.Fighters;

import CombatItems.Weapon;
import Players.Player;
import Surprises.Enemy;
import Surprises.ISurprise;

import java.util.Random;

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

    public int dealRandomDamage() {
        Random rand = new Random();
        return rand.nextInt(dealDamage() + 1);
    }

    public String attack(Enemy enemy) {
        (enemy).setHp((enemy).getHp() - dealRandomDamage());
        return "You've dealt a nasty blow!";
    }



}
