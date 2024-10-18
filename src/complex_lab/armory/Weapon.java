package complex_lab.armory;


public class Weapon implements Equipment {
    private String weaponName;
    private double weaponPrice;
    private double weaponWeight;

    public Weapon(
            String name,
            double price,
            double weight
    ) {
        this.weaponName = name;
        this.weaponPrice = price;
        this.weaponWeight = weight;
    }

    @Override
    public double getPrice() {
        return weaponPrice;
    }

    @Override
    public double getWeight() {
        return weaponWeight;
    }

    @Override
    public String getType() {
        return "Weapon";
    }

    public String getWeaponDescription() {
        return "Weapon: " + weaponName;
    }
}
