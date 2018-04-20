package Surprises;

import java.util.Random;

public enum EnemyType {
    OGRE("ogre", 5, 10),
    GOBLIN("goblin", 3, 6);

    private String type;
    private int damage;
    private int hp;

    EnemyType(String type, int damage, int hp) {
        this.type = type;
        this.damage = damage;
        this.hp = hp;
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
}
