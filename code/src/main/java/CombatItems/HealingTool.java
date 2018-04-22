package CombatItems;

import java.util.Random;

public enum HealingTool {

    POTION("potion", 10),
    HERBS("herbs", 7),
    MEDKIT("medkit", 5);

    private String name;
    private final int healingPower;

    HealingTool(String name, int healingPower) {
        this.name = name;
        this.healingPower = healingPower;
    }

    public String getName() {
        return name;
    }

    public int getHealingPower() {
        return healingPower;
    }


    public static HealingTool getRandomHealingTool() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}


