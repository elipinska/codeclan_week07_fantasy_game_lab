package Castle;

import Npcs.Healers.Cleric;
import Npcs.Npc;
import Players.Player;
import Surprises.*;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private String name;
    private ArrayList<Player> playerOccupants;
    private ArrayList<Npc> npcOccupants;
    private ISurprise surprise;

    public Room(String name, ISurprise surprise) {
        this.name = name;
        this.playerOccupants = new ArrayList<>();
        this.npcOccupants = new ArrayList<>();
        this.surprise = surprise;

    }

    public Room(String name) {
        this.name = name;
        this.playerOccupants = new ArrayList<>();
        this.npcOccupants = new ArrayList<>();
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
        playerOccupants.add(player);
        player.setCurrentRoom(this);
    }

    public void addNpcToRoom(Npc npc) {
        npcOccupants.add(npc);
    }

    public ArrayList<Player> getPlayerOccupants() {
        return playerOccupants;
    }

    public ArrayList<Npc> getNpcOccupants() {
        return npcOccupants;
    }

    public ISurprise getSurprise() {
        return surprise;
    }

    public void removeSurprise() {
        surprise = null;
    }

    public void removeNpc() {
        npcOccupants.remove(0);
    }
}
