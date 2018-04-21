package Players;

import Castle.Room;
import Surprises.ISurprise;
import Surprises.Treasure;
import Surprises.TrophyType;


import java.util.ArrayList;

public abstract class Player {
     private String name;
     private int hp;
     private int level;
     private ArrayList<Treasure> pack;
     private Room currentRoom;

    public Player(String name) {
        this.hp = 25;
        this.level = 1;
        this.pack = new ArrayList<>();
        this.name = name;
        this.currentRoom = null;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String collectTreasure() {
        ISurprise surprise = currentRoom.getSurprise();
        if (surprise.isTreasure()) {
            Treasure treasure = (Treasure) surprise;
            addToPack(treasure);
            currentRoom.removeSurprise();
            return "You've collected some " + (treasure.getName() + ".\n");

        } else {
            return "There's no treasure in this room!";
        }
    }

    public void addToPack(Treasure treasure) {
        pack.add(treasure);
    }

    public void removeFromPack(Treasure treasure) {
        pack.remove(treasure);
    }

    public String searchRoom() {

        if (currentRoom.getSurprise() == null) {
            return "The room appears to be empty.\n";
        } else {
            return currentRoom.getSurprise().encounterSurprise();
        }
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String eatChocolate() {
        String result = "No chocolate found.\n";
        for (Treasure item:pack) {
            if ((item.getName()).equals("chocolate") && hp < 25) {
                removeFromPack(item);
                if (25 - hp < 5) {
                    hp = 25;
                } else {
                    setHp(hp + 5);
                }
                result = "You've eaten some chocolate and regained some health.\n";
                break;
            }

        }
        return result;
    }
}

