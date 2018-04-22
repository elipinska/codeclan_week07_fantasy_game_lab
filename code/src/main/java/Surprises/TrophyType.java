package Surprises;

public enum TrophyType {
    OGRE_TROPHY("ogre trophy", 150),
    GOBLIN_TROPHY("goblin trophy", 70);

    private String type;
    private int value;

    TrophyType(String type, int value) {
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
