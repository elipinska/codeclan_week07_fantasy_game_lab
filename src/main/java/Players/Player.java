package Players;

import Castle.DangerRoom;
import Castle.Room;
import Castle.TreasureRoom;
import Surprises.Enemy;
import Surprises.Treasure;

import java.util.ArrayList;

public abstract class Player {
     String name;
     int hp;
     int level;
     ArrayList<Treasure> pack;

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

    public ArrayList<Treasure> getPack() {
        return pack;
    }

    public void enterRoom(Room room) {
        room.addPlayerToRoom(this);
    }

    public void searchForTreasure(Room room) {
        if (room.getClass() == TreasureRoom.class) {
            TreasureRoom treasureRoom = (TreasureRoom) room;
            collectTreasure(treasureRoom.getTreasure());
        }
    }

    public void collectTreasure(Treasure treasure) {
        pack.add(treasure);
    }


 }

