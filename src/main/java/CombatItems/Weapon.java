package CombatItems;

public enum Weapon {

    SWORD(5),
    AXE(3),
    CLUB(2),
    BOW(4);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
