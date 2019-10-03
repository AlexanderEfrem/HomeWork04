package OthertASKS.Task02;

import java.text.DecimalFormat;

public class Distance {
    private double distance;

    FuelLogic fuelLogic = new FuelLogic();
    DecimalFormat df = new DecimalFormat("#.##");

    public double calculateDistance(Car car) {
        this.distance = ((double) car.getFuel().getFuel() / fuelLogic.calculateAverageMVP(car)) * fuelLogic.wheelRatioFinal(car) * 100;
        System.out.println("You drive " + df.format(distance) + " kilometers") ;
        return distance;
    }
}
