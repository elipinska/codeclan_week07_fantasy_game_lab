package Surprises;

public enum TreasureType {

    GOLD("gold", 100),
    GEMS("gems", 200),
    WEAPONS("weapons", 50),
    CHOCOLATE("chocolate", 30);

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


}
