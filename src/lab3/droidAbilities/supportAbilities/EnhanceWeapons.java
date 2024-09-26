package lab3.droidAbilities.supportAbilities;

import lab3.droidAbilities.Ability;
import lab3.droids.Droid;

public class EnhanceWeapons implements Ability {
    @Override
    public void useAbility(Droid targetDroid) {
        int targetDp = targetDroid.getDroidDp();
        int dpEnhancement = targetDp / 2;
        targetDroid.updateDroidDp(targetDp + dpEnhancement);
    }
}
