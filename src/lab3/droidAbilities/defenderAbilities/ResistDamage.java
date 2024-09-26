package lab3.droidAbilities.defenderAbilities;

import lab3.droidAbilities.Ability;
import lab3.droids.Droid;

public class ResistDamage implements Ability {
    @Override
    public void useAbility(Droid targetDroid) {
        int targetDp = targetDroid.getDroidDp();
        targetDroid.updateDroidDp(targetDp - targetDp / 4);
    }
}
