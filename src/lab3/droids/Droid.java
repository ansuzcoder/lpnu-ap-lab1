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
    public void updateDroidHp(int droidHp) { this.droidHp = Math.min(maxHp, Math.max(0, droidHp)); }

    public int getDroidDp() { return droidDp; }
    public void updateDroidDp(int droidDp) { this.droidDp = droidDp; }

    public void disconnectDroid() { status = Status.DISCONNECTED; }
    public Status checkDroidStatus() { return status; }
    public boolean isIntact() { return checkDroidStatus() == Status.ACTIVE; }

    public void handleReceivedDamage(int damage) {
        int droidHp = this.getDroidHp();
        int hpChange = droidHp - damage;

        if (hpChange <= 0) {
            System.out.println(this + " is eliminated...");
             this.updateDroidHp(0);
             this.disconnectDroid();
             return;
         }

        this.updateDroidHp(hpChange);
    }

    public void attackEnemy(Droid targetDroid) {
        if (targetDroid.checkDroidStatus() == Status.DISCONNECTED) {
            System.out.println("Request INTERRUPTED. Target is DISCONNECTED.");
            return;
        }

        int currentDroidDp = this.getDroidDp();

        System.out.println(this + " attacks enemy [" + targetDroid + "]");
        targetDroid.handleReceivedDamage(currentDroidDp);
    }

    @Override
    public String toString() {
        return "DROID INFO: [Battle droid {" + droidName + "}, droid type: {" + droidType + "}]";
    }
}
