package Players;

import java.util.ArrayList;

public abstract class Player {
     String name;
     int hp;
     int level;
     ArrayList<String> pack;

    public Player(String name) {
        this.hp = 25;
        this.level = 1;
        this.pack = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<String> getPack() {
        return pack;
    }
}
