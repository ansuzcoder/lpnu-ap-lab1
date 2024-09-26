package lab3.droidAbilities.supportAbilities;

import lab3.droidAbilities.Ability;
import lab3.droids.Droid;

public class Repair implements Ability {
    @Override
    public void useAbility(Droid targetDroid) {
        targetDroid.updateDroidHp(Math.min(targetDroid.getDroidMaxHp(), targetDroid.getDroidHp() + 50));
    }
}
