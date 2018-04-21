package Combat;

import Players.Fighters.Fighter;
import Players.Player;
import Surprises.Enemy;

public class Combat {
    private Player player1;
    private Enemy enemy1;



    public String commenceFight(Player player1, Enemy enemy1) {
        String result = "";
        while ((player1.getHp() > 0) && (enemy1.getHP() > 0)) {

            ((Fighter) player1).attack(enemy1);
            enemy1.attack(player1);
            if (enemy1.getHP() <= 0) {
                result = "You've slayed the beast!" + player1.getHp();
                break;
            } else if (player1.getHp() <=0) {
                result =  "You've been defeated! Game over.";
                break;
            }
        }
        return result;
    }
}
