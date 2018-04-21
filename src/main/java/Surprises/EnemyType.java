package Surprises;

import java.util.Random;

public enum EnemyType {
    OGRE("an ogre", 5, 12, "\"Gruugh agh agh waaagh!\"", new Treasure(TrophyType.OGRE_TROPHY)),
    GOBLIN("a goblin", 4, 8,"\"Yawp!\"", new Treasure(TrophyType.GOBLIN_TROPHY));

    private String type;
    private int damage;
    private int hp;
    private String battleCry;
    private Treasure trophy;

    EnemyType(String type, int damage, int hp, String battleCry, Treasure trophy) {
        this.type = type;
        this.damage = damage;
        this.hp = hp;
        this.battleCry = battleCry;
        this.trophy = trophy;
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

    public Treasure getTrophy() {
        return trophy;
    }
}
