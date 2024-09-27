package lab3.gameComponents.gameSetup;

import lab3.droidTypes.DroidType;
import lab3.droidTypes.droidSubtypes.DroidSubtype;

public class DroidClass {
    private DroidType droidType;
    private DroidSubtype droidSubtype;

    public DroidType getDroidType() {
        return droidType;
    }

    public DroidSubtype getDroidSubtype() {
        return droidSubtype;
    }

    public DroidClass(
            DroidType droidType,
            DroidSubtype droidSubtype
    ) {
        this.droidType = droidType;
        this.droidSubtype = droidSubtype;
    }
}