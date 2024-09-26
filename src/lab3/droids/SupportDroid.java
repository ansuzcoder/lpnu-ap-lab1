package lab3.droids;

import lab3.droidAbilities.Ability;
import lab3.droidAbilities.supportAbilities.EnhanceWeapons;
import lab3.droidAbilities.supportAbilities.Repair;
import lab3.droidTypes.DroidType;
import lab3.droidTypes.droidSubtypes.SupportDroidSubtype;

import java.util.ArrayList;
import java.util.List;

public class SupportDroid extends Droid {
    protected final SupportDroidSubtype droidSubtype;
    protected List<Ability> droidAbilities;

    public SupportDroid(
            String droidName,
            DroidType droidType,
            SupportDroidSubtype droidSubtype
    ) {
        super(droidName, droidType);
        this.droidSubtype = droidSubtype;

        this.maxHp = 60;
        this.droidHp = 60;
        this.droidDp = 30;

        droidAbilities = new ArrayList<>();
        switch (droidSubtype) {
            case REPAIR:
                droidAbilities.add(new Repair());
                break;
            case ENHANCER:
                droidAbilities.add(new EnhanceWeapons());
                break;
        }
    }
}
