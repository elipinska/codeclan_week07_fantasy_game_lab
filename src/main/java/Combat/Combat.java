package Combat;

import Players.Fighters.Fighter;
import Players.Player;
import Surprises.Enemy;

public class Combat {
    private Player player1;
    private Enemy enemy1;



    public String commenceFight(Player player1) {
        Enemy enemy1 = (Enemy) player1.getCurrentRoom().getSurprise();
        System.out.println("You're attacked by " + enemy1.getType() + "!");
        String result = "";
        while ((player1.getHp() > 0) && (enemy1.getHp() > 0)) {
            System.out.println(enemy1.getBattleCry());
            System.out.println(enemy1.attack(player1));
            if (player1.getHp() <=0) {
                result =  "You've been defeated! Game over.";
                break;
            }
            System.out.println(((Fighter) player1).battleCry() );
            System.out.println(((Fighter) player1).attack(enemy1));
            if (enemy1.getHp() <= 0) {
                result = "You've slayed the beast! HP left: " + player1.getHp() + "\n";
                player1.addToPack(enemy1.getTrophy());
                player1.getCurrentRoom().removeSurprise();
                break;}
        }
        return result;
    }
}
