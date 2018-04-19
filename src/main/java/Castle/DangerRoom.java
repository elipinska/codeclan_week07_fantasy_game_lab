package Castle;

import Surprises.Enemy;

public class DangerRoom extends Room {

    private Enemy enemy;

    public DangerRoom(String name, Enemy enemy) {
        super(name);
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
