package lab3.droidTypes.droidSubtypes;

import lab3.droidTypes.DroidType;

public enum DefenderDroidSubtype implements DroidSubtype {
    ARMORED,
    GUARDIAN;

    @Override
    public DroidType getDroidType() {
        return DroidType.DEFENDER;
    }
}
