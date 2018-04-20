package Runner;

import Castle.*;
import CombatItems.Weapon;
import Players.Fighters.Barbarian;
import Players.Fighters.Dwarf;
import Players.Fighters.Knight;
import Players.Player;
import Surprises.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {


    public static void main (String[] args) {

        String raceType;
        String weaponType;
        Weapon weapon = null;
        Player player1 = null;
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

        castle.getRoomList().get(0).addPlayerToRoom(player1);

        while (true) {
            System.out.println("You are in ");
        }






    }
}
