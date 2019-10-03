package OthertASKS.Task02;

import java.text.DecimalFormat;

public class CarLogic {
    private static int gasStation = 3;
    private double spendDistance;

    Distance distance = new Distance();
    DecimalFormat df = new DecimalFormat("#.##");


    public double LetsGo(Car car) {
        if(Integer.valueOf(car.getFuel().toString()) == 0) {
            System.out.println("Maybe in future it will be real, but now cars cannot go without fuel");
            System.out.println("Your distance " + spendDistance);
            System.exit(1);
        } else {
            spendDistance = distance.calculateDistance(car) + this.spendDistance;
            Fuel fuel = new Fuel(Fuel.fuelMin);
            car.setFuel(fuel);
            System.out.println("You spend all your fuel, go to Gas Station quick!");
        }
        return spendDistance;
    }
    public void gasStation(Car car) {
        if (gasStation > 0) {
            gasStation = gasStation - 1;
            Fuel fuel = new Fuel(Fuel.fuelMax);
            car.setFuel(fuel);
        } else {
            System.out.println("It was last Gas Station" + "\n Your distance is " + df.format(spendDistance));
            System.exit(1);
        }
    }

    public void changeWheel(Car car) {
        WheelLogic wheelLogic = new WheelLogic();
        Wheel wheel = wheelLogic.selectWheel();
        car.setWheel(wheel);
        System.out.println("We change wheel to " + car.getWheel().toString());
    }

    public void printGasStation() {
        System.out.println(gasStation);
    }
}
