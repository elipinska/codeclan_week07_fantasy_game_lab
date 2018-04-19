package Castle;

import Surprises.Treasure;

public class TreasureRoom extends Room {

    private Treasure treasure;

    public TreasureRoom(String name, Treasure treasure) {
        super(name);
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }
}
