package Castle;

import Players.Player;
import Surprises.ISurprise;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Player> occupants;
    private ISurprise surprise;

    public Room(String name, ISurprise surprise) {
        this.name = name;
        this.occupants = new ArrayList<>();
        this.surprise = surprise;

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

    public ISurprise getSurprise() {
        return surprise;
    }
}
