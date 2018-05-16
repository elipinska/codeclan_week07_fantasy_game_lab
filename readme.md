
# Castle Capture - text-based fantasy adventure game in Java

## Update

As part of weekend homework aimed at <b>practicing polymorphism (through the use of inheritance, interfaces and method overloading/overriding) in Java</b>, I extended the spec below to include a runner file, which makes in possible to play a simple game of Castle Capture. You can choose your player race (dwarf, barbarian or knight), pick your weapon (bow, axe or sword) and then embark on an adventure which will take you through 12 chambers of a castle. You will collect treasures and fight evil monsters; if you're lucky, you'll come across a cleric who will offer to heal some of your wounds in exchange for gold (eating chocolate will help you get better too!).

### To run the game in the command line:
* download the CastleCapture.jar file
* in the terminal, use the command ```java -jar CastleCapture.jar```	


# Original spec for the lab:

## Lab - Fantasy Adventure

The task is to model a fantasy adventure. The game will have players, who will have a number of health points and weapons/spells. Players will fall into different categories:

* Dwarves, Barbarians, Knights
	* each of these will have a weapon and fight with other players (Sword, Axe, Club, etc)
	* should be able to change their weapon at any point in the game.
* Warlocks and Wizards
	* they will be able to cast spells on others (Fireball, Lightning Strike, etc).
	* they will have a mythical creature (e.g. Ogre, Dragon) who will defend them from attackers.
	* should be able to change spells or creature at any point in the game.
* Clerics
	* they will have healing tools with which they can heal other players (potion, herbs, etc).
	* should be able to change healing tool at any point in the game.

The game will also have rooms to work through. Each room should either have some kind of treasure (Gold, Gems) to collect or an Enemy (Troll, Orc) to defeat before moving on.

## Remember
 * Use TDD
 * Git commit regularly

## Tasks

* Create the players and rooms for the adventure. (Don't worry about giving the rooms any exits.)
* Give different players properties/methods that are specific to their own class. (e.g. a Knight could have armour that could reduce damage they take)
* The user should complete rooms by either collecting treasure or defeating an enemy and a new room will be presented to them. 
