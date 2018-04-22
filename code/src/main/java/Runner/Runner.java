package Runner;

import Castle.*;
import CombatItems.Weapon;
import Npcs.Healers.Cleric;
import Npcs.Npc;
import Players.Fighters.Barbarian;
import Players.Fighters.Dwarf;
import Players.Fighters.Knight;
import Players.Player;
import Combat.Combat;
import Surprises.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {


    public static void main (String[] args) {

        String raceType;
        String weaponType;
        Weapon weapon = null;
        Player player1 = null;
        Boolean exit = false;
        int nextRoomNo = 0;
        int maxHp = 0;

        Room startRoom = new Room("Great Hall");
        Room surpriseRoom1 = new Room("Armoury");
        Room surpriseRoom2 = new Room("Kitchen");
        Room surpriseRoom3 = new Room("Pantry");
        Room surpriseRoom4 = new Room("Storeroom");
        Room surpriseRoom5 = new Room("Main stairs");
        Room surpriseRoom6 = new Room("Small bedchamber");
        Room surpriseRoom7 = new Room("Lavatory");
        Room surpriseRoom8 = new Room("Large bedchamber");
        Room surpriseRoom9 = new Room("Narrow staircase");
        Room surpriseRoom10 = new Room("Dungeon");
        Room surpriseRoom11 = new Room("Chapel");
        ArrayList<Room> roomList = new ArrayList<>();
        roomList.addAll(Arrays.asList(startRoom, surpriseRoom1, surpriseRoom2, surpriseRoom3, surpriseRoom4, surpriseRoom5, surpriseRoom6, surpriseRoom7, surpriseRoom8, surpriseRoom9, surpriseRoom10, surpriseRoom11));
        Castle castle = new Castle(roomList);

        Npc cleric1 = new Cleric("Dulgren");
        Npc cleric2 = new Cleric("Artanis");

        Random rand = new Random();
        int randomRoomIndex1 = rand.nextInt(castle.getRoomList().size() - 7) + 2; //Room index between 2-6 4
        int randomRoomIndex2 = rand.nextInt(castle.getRoomList().size() - 8) + 7; //Room index between 7-10

        castle.getRoomList().get(randomRoomIndex1).addNpcToRoom(cleric1);
        castle.getRoomList().get(randomRoomIndex2).addNpcToRoom(cleric2);


        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome, brave adventurer! What's your name?");
        String playerName = scan.nextLine();

        System.out.println("Hello, " + playerName + "!");

        do {
            System.out.println("Pick your race by typing one of the options: dwarf, barbarian, knight");
            raceType = scan.nextLine();
        } while ( !(raceType.matches("dwarf|knight|barbarian")));


        System.out.println("What's your weapon?");

        do {
            System.out.println("Pick one of the options: sword, axe, club, bow.");
            weaponType = scan.nextLine();
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

        maxHp = player1.getHp();
        castle.getRoomList().get(nextRoomNo).addPlayerToRoom(player1);
        nextRoomNo +=1;


        while (!exit) {
            ArrayList<String> availableActions = new ArrayList();
            availableActions.addAll(Arrays.asList("search room", "next room", "view pack", "check health", "eat chocolate", "quit"));

            System.out.println("You are in the " + player1.getCurrentRoom().getName()+ ".");
            if (player1.getCurrentRoom().getNpcOccupants().size() > 0) {
                System.out.println(player1.getCurrentRoom().getNpcOccupants().get(0).meetPlayer());
                availableActions.add(0, "ask cleric for healing");
            }
            System.out.println("What would you like to do?");
            System.out.println("Available actions: " + availableActions);
            String action = scan.nextLine();

            switch (action) {
                case "ask cleric for healing": Cleric cleric = (Cleric) player1.getCurrentRoom().getNpcOccupants().get(0);
                                               System.out.println(cleric.heal(player1));
                                               player1.getCurrentRoom().removeNpc();
                                               availableActions.remove("ask cleric for healing");
                                               break;
                case "search room":
                    System.out.println(player1.searchRoom());
                    ISurprise surprise = player1.getCurrentRoom().getSurprise();
                    if (surprise != null && surprise.isTreasure()) {
                        System.out.println("Would you like to open it? y/n");
                       do {
                           action = scan.nextLine();
                       } while (!(action).matches("y|n"));
                       if ((action).equals("y")) {
                           System.out.println(player1.collectTreasure());
                       }
                    } else if (surprise != null && surprise.isEnemy()) {
                        Combat combat = new Combat();
                        System.out.println(combat.commenceFight(player1));
                    }
                              break;
                case "next room": if (nextRoomNo < castle.getRoomList().size()) {
                                player1.enterRoom(castle.getRoomList().get(nextRoomNo));
                                  nextRoomNo += 1;
                                } else {
                                    System.out.println("You've found the exit from the castle! Game over.");
                                    System.out.println("Items collected:");
                                    System.out.println("-------------------------------");
                                    ArrayList<Treasure> pack = player1.getPack();
                                    int score = 0;
                                    for (Treasure item:pack) {
                                        System.out.println("Item: " + item.getName() + ", value: " + item.getValue() + "gp;");
                                        score += item.getValue();
                                    }
                                    System.out.println("-------------------------------");
                                    System.out.println("Overall score: " + score + "gp");
                                    exit = true;
                                }
                                break;
                case "view pack":
                                    System.out.println("All items in your backpack:");
                                    ArrayList<Treasure> pack = player1.getPack();
                                    for (Treasure item:pack) {
                                        System.out.println("Item: " + item.getName() + ", value: " + item.getValue() + "gp;");
                                    }
                                    System.out.println("\n");
                                    break;
                case "check health":
                                    System.out.println("Your health points: " + player1.getHp() + "/" + maxHp + "\n");
                                    break;
                case "eat chocolate": System.out.println(player1.eatChocolate());
                                    break;
                case "quit": exit = true;
                            break;
            }

        if (player1.getHp() <= 0) {
                exit = true;
        }

        }





    }

}
