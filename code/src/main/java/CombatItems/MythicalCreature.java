package CombatItems;

public enum MythicalCreature {

    DRAGON(5),
    UNICORN(3),
    GRIFFIN(4);

    private final int shieldValue;

    MythicalCreature(int shieldValue){
        this.shieldValue = shieldValue;
    }

    public int getShieldValue() {
        return shieldValue;
    }
}

