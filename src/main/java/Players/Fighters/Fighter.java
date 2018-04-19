package Players.Fighters;

import Castle.DangerRoom;
import Castle.Room;
import CombatItems.Weapon;
import Players.Player;
import Surprises.Enemy;

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

    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHP() - dealDamage());
    }

    public void searchForEnemies(Room room){
        if (room.getClass() == DangerRoom.class) {
            DangerRoom dangerRoom = (DangerRoom) room;
            attack(dangerRoom.getEnemy());
        }
    }


}
