package Surprises;

public class Treasure implements ISurprise {

    private TreasureType treasureType;
    private TrophyType trophyType;
    private String name;
    private int value;

    public Treasure(TreasureType treasureType) {
        this.treasureType = treasureType;
        this.name = treasureType.getType();
        this.value = treasureType.getValue();
    }

    public Treasure(TrophyType trophyType) {
        this.trophyType = trophyType;
        this.name = trophyType.getType();
        this.value = trophyType.getValue();
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }

    public TrophyType getTrophyType() {
        return trophyType;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String encounterSurprise() {
        return "You have found a locked wooden chest!";
    }

    public Boolean isTreasure() {
        return true;
    }

    public Boolean isEnemy() {
        return false;
    }
}
