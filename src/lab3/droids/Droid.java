package lab3.droids;

import lab3.Status;
import lab3.droidTypes.DroidType;

public class Droid {
    protected final String droidName;
    protected final DroidType droidType;

    protected int maxHp = 100;      // health point
    protected int droidHp = 80;      // health point
    protected int droidDp = 25;       // damage points

    private Status status = Status.ACTIVE;

    public Droid(
            String droidName,
            DroidType droidType
    ) {
        this.droidName = droidName;
        this.droidType = droidType;
    }

    public int getDroidMaxHp() { return maxHp; }
    public int getDroidHp() { return droidHp; }
    public void updateDroidHp(int droidHp) { this.droidHp = droidHp; }

    public int getDroidDp() { return droidDp; }
    public void updateDroidDp(int droidDp) { this.droidDp = droidDp; }

    public void disconnectDroid() { status = Status.DISCONNECTED; }
    public Status checkDroidStatus() { return status; }

    public void handleReceivedDamage(int damage) {
        if (damage <= 0) { return; }

        int currentDroidHp = getDroidHp();
        updateDroidHp(currentDroidHp - damage);

        if (getDroidHp() == 0) { disconnectDroid(); }
    }

    public void attackEnemy(Droid targetDroid) {
        if (targetDroid.checkDroidStatus() == Status.DISCONNECTED) {
            System.out.println("Request INTERRUPTED. Target is DISCONNECTED.");
            return;
        }

        int targetDroidHp = targetDroid.getDroidHp();
        int currentDroidDp = getDroidDp();

        targetDroid.handleReceivedDamage(targetDroidHp - currentDroidDp);

        if (targetDroid.getDroidHp() == 0) { targetDroid.disconnectDroid(); }
    }

    @Override
    public String toString() {
        return "DROID INFO: [Battle droid {" + droidName + "}, droid type: {" + droidType + "}]";
    }
}
