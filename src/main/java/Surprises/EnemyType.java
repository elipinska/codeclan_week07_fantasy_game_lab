package Surprises;

import java.util.Random;

public enum EnemyType {
    OGRE("ogre", 5, 12, "\"Gruugh agh agh waaagh!\""),
    GOBLIN("goblin", 4, 8,"\"Yawp!\"");

    private String type;
    private int damage;
    private int hp;
    private String battleCry;

    EnemyType(String type, int damage, int hp, String battleCry) {
        this.type = type;
        this.damage = damage;
        this.hp = hp;
        this.battleCry = battleCry;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public static EnemyType getRandomEnemyType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String getBattleCry() {
        return battleCry;
    }
}
