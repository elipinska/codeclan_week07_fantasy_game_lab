package Surprises;

import Players.Player;

public class Enemy {

    private String name;
    private String type;
    private int damage;
    private int hp;


    public Enemy(String name, String type, int damage, int hp) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.hp = hp;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHP(){
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attackHero(Player player) {

    }
}
