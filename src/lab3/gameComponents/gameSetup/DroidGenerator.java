package lab3.gameComponents.gameSetup;

import java.util.Random;

import lab3.droidTypes.DroidType;
import lab3.droidTypes.droidSubtypes.*;
import lab3.droids.*;

public class DroidGenerator {
    private static final Random rand = new Random();

    private static final String[] COMBAT_NAMES = {"CT-47", "RX-99", "KR-10", "TF-21", "XT-88"};

    private static final String[] DEFENDER_NAMES = {"DL-02", "DR-77", "GH-33", "TH-04", "ST-15"};

    private static final String[] SUPPORT_NAMES = {"HS-03", "RL-22", "XR-50", "SD-17", "MR-09"};

    private static final String[] SPECIAL_NAMES = {"REM-02", "LX-05", "OM-13", "ZN-71", "VP-00", "YN-42"};

    public Droid createDroid(DroidType droidType, DroidSubtype droidSubtype) {
        return switch (droidType) {
            case COMBAT -> createCombatDroid((CombatDroidSubtype) droidSubtype);
            case DEFENDER -> createDefenderDroid((DefenderDroidSubtype) droidSubtype);
            case SUPPORT -> createSupportDroid((SupportDroidSubtype) droidSubtype);
            default -> throw new IllegalArgumentException("DroidType [" + droidType + "] is not supported");
        };
    }

    public Droid createCombatDroid(CombatDroidSubtype droidSubtype) {
        String droidName = COMBAT_NAMES[rand.nextInt(COMBAT_NAMES.length)];
        return new CombatDroid(droidName, DroidType.COMBAT, droidSubtype);
    }

    public Droid createDefenderDroid(DefenderDroidSubtype droidSubtype) {
        String droidName = DEFENDER_NAMES[rand.nextInt(DEFENDER_NAMES.length)];
        return new DefenderDroid(droidName, DroidType.DEFENDER, droidSubtype);
    }

    public Droid createSupportDroid(SupportDroidSubtype droidSubtype) {
        String droidName = SUPPORT_NAMES[rand.nextInt(SUPPORT_NAMES.length)];
        return new SupportDroid(droidName, DroidType.SUPPORT, droidSubtype);
    }
}
