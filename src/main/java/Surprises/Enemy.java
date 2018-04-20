package Surprises;

import Players.Player;

public class Enemy implements ISurprise {

    private String type;
    private EnemyType enemyType;
    private int damage;
    private int hp;


    public Enemy(EnemyType enemyType) {
        this.type = enemyType.getType();
        this.enemyType = enemyType;
        this.damage = enemyType.getDamage();
        this.hp = enemyType.getHp();
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

    public int getHP(){
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
}
