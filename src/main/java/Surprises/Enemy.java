package Surprises;

import Players.Player;

import java.util.Random;

public class Enemy implements ISurprise {

    private String type;
    private EnemyType enemyType;
    private int damage;
    private int hp;
    private String battleCry;
    private Treasure trophy;


    public Enemy(EnemyType enemyType) {
        this.type = enemyType.getType();
        this.enemyType = enemyType;
        this.damage = enemyType.getDamage();
        this.hp = enemyType.getHp();
        this.battleCry = enemyType.getBattleCry();
        this.trophy = enemyType.getTrophy();

    }

    public int getDamage() {
        return this.damage;
    }

    public String getType() {
        return type;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public String getBattleCry() {
        return battleCry;
    }

    public int getHp(){
        return hp;
    }

    public String encounterSurprise() {
        return "You hear something moving in the corner of the room... \n";

    }

    public Boolean isTreasure() {
        return false;
    }

    public Boolean isEnemy() {
        return true;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int dealRandomDamage() {
        Random rand = new Random();
        return rand.nextInt(getDamage() + 1);
    }

    public String attack(Player player) {
        (player).setHp((player).getHp() - dealRandomDamage());
        return "The enemy strikes!";
    }

    public Treasure getTrophy() {
        return trophy;
    }
}
