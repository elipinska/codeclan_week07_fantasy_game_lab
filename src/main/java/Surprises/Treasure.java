package Surprises;

public enum Treasure {

    GOLD(100),
    GEMS(200),
    WEAPONS(50),
    CHOCOLATE(30);

    private int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
