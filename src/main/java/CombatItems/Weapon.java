package CombatItems;

public enum Weapon {

    SWORD(10),
    AXE(8),
    CLUB(6),
    BOW(7);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
