package Npcs.Healers;

import Players.Player;

public class Cleric extends Healer {

    public Cleric(String name) {
        super(name);
    }

    public String heal(Player player1) {
        String result = "It looks like you can't afford cleric's services!\n";
        if (player1.canPayForHealing()) {
            result = "The cleric looks you over but sees no wounds to heal.\n";

            int playerHp = player1.getHp();
                if (playerHp < 25) {
                    if (25 - playerHp < 5) {
                        playerHp = 25;
                    } else {
                        player1.setHp(playerHp + getHealingtool().getHealingPower());
                    }
                    result = "The cleric heals you with " + getHealingtool().getName() + ". Your current hp: " + player1.getHp() +"\n";
                }
            }
        return result;
    }

    public String meetPlayer() {
        return "You see a hooded figure of a cleric. He holds a wooden sign saying \"Will heal for 100gp. Gems not accepted, sorry\"";
    }


}
