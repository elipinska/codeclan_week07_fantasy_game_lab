package Players.Mages;

import CombatItems.MythicalCreature;
import CombatItems.Spell;
import Players.Player;
import Surprises.Enemy;

public abstract class Mage extends Player implements ICast {

    private Spell spell;
    private MythicalCreature mythicalCreature;

    public Mage (String name, Spell spell, MythicalCreature mythicalCreature) {
        super(name);
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public int dealSpellDamage() {
        return spell.getDamage();
    }

    public int callForDefence() {
        return mythicalCreature.getShieldValue();
    }

    public void attack(Enemy enemy) {
        enemy.setHp(enemy.getHP() - dealSpellDamage());
    }

}
