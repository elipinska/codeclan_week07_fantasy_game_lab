package Surprises;

import java.util.Random;

public enum TreasureType {

    GOLD("gold", 100),
    GEMS("gems", 200),
    WEAPONS("weapons", 30),
    CHOCOLATE("chocolate", 1);

    private String type;
    private int value;

    TreasureType(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public static TreasureType getRandomTreasureType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }


}
