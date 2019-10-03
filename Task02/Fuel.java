package OthertASKS.Task02;

public class Fuel {
    private int fuel;
    public static final int fuelMax = 70;
    public static final int fuelMin = 0;

    public Fuel() {
        this.fuel = 70;
    }

    public Fuel(int fuel) {
        if (fuel > fuelMax || fuel < fuelMin) {
            this.fuel = 70;
        } else {
            this.fuel = fuel;
        }
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return ""+ fuel;
    }
}
