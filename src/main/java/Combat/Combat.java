package Combat;

import Players.Fighters.Fighter;
import Players.Player;
import Surprises.Enemy;

public class Combat {
    private Player player1;
    private Enemy enemy1;



    public String commenceFight(Player player1, Enemy enemy1) {
        System.out.println("You attack the nasty " + enemy1.getType() + "!");
        String result = "";
        while ((player1.getHp() > 0) && (enemy1.getHp() > 0)) {

            ((Fighter) player1).attack(enemy1);
            enemy1.attack(player1);
            if (enemy1.getHp() <= 0) {
                result = "You've slayed the beast! HP left: " + player1.getHp() + "\n";
                break;
            } else if (player1.getHp() <=0) {
                result =  "You've been defeated! Game over.";
                break;
            }
        }
        return result;
    }
}
