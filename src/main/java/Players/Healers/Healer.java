package Players.Healers;

import CombatItems.HealingTool;
import Players.Player;

public abstract class Healer extends Player implements IHeal {

    private HealingTool healingtool;

    public Healer (String name, HealingTool healingTool) {
        super(name);
        this.healingtool = healingTool;
    }

    public int heal() {
        return healingtool.getHealingPower();
    }


}
