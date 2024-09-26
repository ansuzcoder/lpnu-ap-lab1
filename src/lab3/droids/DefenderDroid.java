package lab3.droids;

import lab3.droidAbilities.Ability;
import lab3.droidAbilities.defenderAbilities.GrantShield;
import lab3.droidAbilities.defenderAbilities.ResistDamage;
import lab3.droidTypes.DroidType;
import lab3.droidTypes.droidSubtypes.DefenderDroidSubtype;

import java.util.ArrayList;
import java.util.List;

public class DefenderDroid extends Droid {
    protected final DefenderDroidSubtype droidSubtype;
    protected List<Ability> droidAbilities;

    public DefenderDroid(
            String droidName,
            DroidType droidType,
            DefenderDroidSubtype droidSubtype
    ) {
        super(droidName, droidType);
        this.droidSubtype = droidSubtype;

        droidAbilities = new ArrayList<>();
        switch (droidSubtype) {
            case ARMORED:
                this.maxHp = 100;
                this.droidHp = 120;
                this.droidDp = 25;

                droidAbilities.add(new ResistDamage());
                break;
            case GUARDIAN:
                this.maxHp = 150;
                this.droidHp = 250;
                this.droidDp = 10;

                droidAbilities.add(new GrantShield());
                break;
        }
    }
}
