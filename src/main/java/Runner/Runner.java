package Runner;

import Castle.*;
import CombatItems.Weapon;
import Players.Fighters.Barbarian;
import Players.Fighters.Dwarf;
import Players.Fighters.Knight;
import Players.Player;
import Surprises.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {


    public static void main (String[] args) {

        String raceType;
        String weaponType;
        Weapon weapon = null;
        Player player1 = null;
        Boolean exit = false;
        int nextRoomNo = 0;
        ISurprise surprise1 = new Treasure(TreasureType.GOLD);
        ISurprise surprise2 = new Enemy(EnemyType.OGRE);
        ISurprise surprise3 = new Treasure(TreasureType.CHOCOLATE);
        Room startRoom = new Room("Great Hall", surprise3);
        Room treasureRoom1 = new Room("Kitchen", surprise1);
        Room dangerRoom1 = new Room("Bedchamber", surprise2);
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.addAll(Arrays.asList(startRoom, treasureRoom1, dangerRoom1));
        Castle castle = new Castle(roomList);

        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome, brave adventurer! What's your name?");
        String playerName = scan.next();

        System.out.println("Hello, " + playerName + "!");

        do {
            System.out.println("Pick your race by typing one of the options: dwarf, barbarian, knight");
            raceType = scan.next();
        } while ( !(raceType.matches("dwarf|knight|barbarian")));


        System.out.println("What's your weapon?");

        do {
            System.out.println("Pick one of the options: sword, axe, club, bow.");
            weaponType = scan.next();
        } while ( !(weaponType.matches("axe|bow|sword|club")));


        switch (weaponType) {
            case "axe": weapon = Weapon.AXE;
                        break;
            case "sword": weapon = Weapon.SWORD;
                        break;
            case "club": weapon = Weapon.CLUB;
                        break;
            case "bow": weapon = Weapon.BOW;
                        break;
        }

        switch (raceType) {
            case "dwarf": player1 =  new Dwarf(playerName, weapon);
                        break;
            case "knight": player1 = new Knight(playerName, weapon);
                        break;
            case "barbarian": player1 = new Barbarian(playerName, weapon);
                            break;
        }

        castle.getRoomList().get(nextRoomNo).addPlayerToRoom(player1);
        nextRoomNo +=1;


        while (exit == false) {
            System.out.println("You are in " + player1.getCurrentRoom().getName() + ". What would you like to do?");
            ArrayList<String> availableActions = new ArrayList();
            availableActions.addAll(Arrays.asList("search", "walk"));
            System.out.println("Available actions: " + availableActions);
            String action = scan.next();

            switch (action) {
                case "search":
                    System.out.println(player1.searchRoom());
                    if (player1.getCurrentRoom().getSurprise() != null && player1.getCurrentRoom().getSurprise().isTreasure()) {
                        System.out.println("Would you like to open it? y/n");
                       do {
                           action = scan.next();
                       } while (!(action).matches("y|n"));
                       if ((action).equals("y")) {
                           System.out.println(player1.collectTreasure());
                       }
                    }
                              break;
                case "walk": player1.enterRoom(castle.getRoomList().get(nextRoomNo));
                                  nextRoomNo += 1;
                                break;
            }



        }






    }


}
