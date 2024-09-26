package lab3.droidAbilities.defenderAbilities;

import lab3.droidAbilities.Ability;
import lab3.droids.Droid;

public class GrantShield implements Ability {
    @Override
    public void useAbility(Droid targetDroid) {
        targetDroid.updateDroidHp(targetDroid.getDroidHp() + 50);
    }
}
