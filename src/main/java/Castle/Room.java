package Castle;

import Players.Player;
import Surprises.Enemy;
import Surprises.Treasure;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Player> occupants;

    public Room(String name) {
        this.name = name;
        this.occupants = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addPlayerToRoom(Player player) {
        occupants.add(player);
    }

    public ArrayList<Player> getOccupants() {
        return occupants;
    }
}
