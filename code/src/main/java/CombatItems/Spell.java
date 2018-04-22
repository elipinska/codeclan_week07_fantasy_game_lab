package CombatItems;

public enum Spell {

    FIREBALL(7),
    LIGHTENING_STRIKE(6),
    ICE_BLAST(4);


    private final int damage;

    Spell(int damage){
        this.damage = damage;

    }

    public int getDamage(){
        return damage;
    }
}