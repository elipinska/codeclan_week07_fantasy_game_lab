package Npcs.Healers;

import CombatItems.HealingTool;
import Npcs.Npc;

public abstract class Healer extends Npc implements IHeal {

    private HealingTool healingtool;

    public Healer (String name) {
        super(name);
        this.healingtool = HealingTool.getRandomHealingTool();
    }


    public HealingTool getHealingtool() {
        return healingtool;
    }


}
