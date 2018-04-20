package Surprises;

public class Treasure implements ISurprise {

    private TreasureType treasureType;
    private String name;
    private int value;

    public Treasure(TreasureType treasureType) {
        this.treasureType = treasureType;
        this.name = treasureType.getType();
        this.value = treasureType.getValue();
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String encounterSurprise() {
        return "You have found a locked wooden chest";
    }

    public Boolean isTreasure() {
        return true;
    }

    public Boolean isEnemy() {
        return false;
    }
}
