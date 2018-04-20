package Castle;

import Players.Player;
import Surprises.*;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private String name;
    private ArrayList<Player> occupants;
    private ISurprise surprise;

    public Room(String name, ISurprise surprise) {
        this.name = name;
        this.occupants = new ArrayList<>();
        this.surprise = surprise;

    }

    public Room(String name) {
        this.name = name;
        this.occupants = new ArrayList<>();
        Random random = new Random();
        int randomNo = random.nextInt(2);
        if (randomNo == 0) {
            this.surprise = new Treasure(TreasureType.getRandomTreasureType());
        } else  {
            this.surprise = new Enemy(EnemyType.getRandomEnemyType());
        }
    }

    public String getName(){
        return name;
    }

    public void addPlayerToRoom(Player player) {
        occupants.add(player);
        player.setCurrentRoom(this);
    }

    public ArrayList<Player> getOccupants() {
        return occupants;
    }

    public ISurprise getSurprise() {
        return surprise;
    }

    public void removeSurprise() {
        surprise = null;
    }
}
