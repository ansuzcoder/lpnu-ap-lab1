package lab3.droids;

import lab3.droidTypes.DroidType;
import lab3.droidTypes.droidSubtypes.CombatDroidSubtype;

public class CombatDroid extends Droid {
    protected final CombatDroidSubtype droidSubtype;

    public CombatDroid(String droidName, DroidType droidType, CombatDroidSubtype droidSubtype) {
        super(droidName, droidType);
        this.droidSubtype = droidSubtype;

        switch (droidSubtype) {
            case STORMTROOPER:
                this.maxHp = 80;
                this.droidHp = 80;
                this.droidDp = 50;
                break;
            case SUICIDE_BOMBER:
                this.maxHp = 20;
                this.droidHp = 20;
                this.droidDp = 250;
                break;
        }
    }

    @Override
    public String toString() {
        return "DROID INFO: [Battle droid {" + droidName + "}, droid type: {" + droidType + "}, droid spec.: {"+ droidSubtype + "}]";
    }
}
