package CombatItems;

public enum HealingTool {

    POTION(5),
    HERBS(4),
    MEDKIT(3);

    private final int healingPower;

    HealingTool(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}


