package lab3.droidTypes.droidSubtypes;

import lab3.droidTypes.DroidType;

public enum SupportDroidSubtype implements DroidSubtype {
    REPAIR,
    ENHANCER;

    @Override
    public DroidType getDroidType() {
        return DroidType.SUPPORT;
    }
}
