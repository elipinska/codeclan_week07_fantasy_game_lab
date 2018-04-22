package Npcs;

public abstract class Npc {

    private String name;


    public Npc(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String meetPlayer() {
        return "You see a hooded figure.\n";
    }
}
