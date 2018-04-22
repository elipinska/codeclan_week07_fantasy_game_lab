package CombatItems;

public enum Weapon {

    SWORD(13),
    AXE(11),
    CLUB(9),
    BOW(8);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
