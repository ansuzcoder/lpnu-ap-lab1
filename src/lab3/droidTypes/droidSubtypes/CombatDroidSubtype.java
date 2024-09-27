package lab3.droidTypes.droidSubtypes;

import lab3.droidTypes.DroidType;

public enum CombatDroidSubtype implements DroidSubtype {
    STORMTROOPER,
    SUICIDE_BOMBER;

    @Override
    public DroidType getDroidType() {
        return DroidType.COMBAT;
    }
}
