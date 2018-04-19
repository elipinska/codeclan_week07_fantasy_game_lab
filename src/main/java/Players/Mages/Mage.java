package Players.Mages;

import CombatItems.Spell;
import Players.Player;

public abstract class Mage extends Player implements ICast {

    private Spell spell;

    public Mage (String name, Spell spell) {
        super(name);
        this.spell = spell;
    }

    public int dealSpellDamage() {
        return spell.getDamage();
    }

}
