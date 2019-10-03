package OthertASKS.Task02;

import java.util.Scanner;

public class EngineLogic {
    private EngineCapacity engineCapacity;
    private FuelType fuelType;

    public Engine selectEngine() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Engine capacity");
        System.out.println(java.util.Arrays.asList(EngineCapacity.values()));
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println(java.util.Arrays.asList(EngineCapacity.values()));
        }
        int x = sc.nextInt();
        switch (x) {
            case 1:
                this.engineCapacity = EngineCapacity.LowEngineCapacity;
                break;
            case 2:
                this.engineCapacity = EngineCapacity.LowEngineCapacity2;
                break;
            case 3:
                this.engineCapacity = EngineCapacity.MediumEngineCapacity;
                break;
            case 4:
                this.engineCapacity = EngineCapacity.HighEngineCapacity;
                break;
            case 5:
                this.engineCapacity = EngineCapacity.NotEnoughEngineCapacity;
                break;
            case 6:
                this.engineCapacity = EngineCapacity.NeedMore;
                break;
            case 7:
                this.engineCapacity = EngineCapacity.FuckFuelEconomy;
                break;
        }

        System.out.println("Select Fuel Type");
        System.out.println(java.util.Arrays.asList(FuelType.values()));
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println(java.util.Arrays.asList(FuelType.values()));
        }
        int y = sc.nextInt();
        switch (y) {
            case 1:
                this.fuelType = FuelType.Diesel;
                break;
            case 2:
                this.fuelType = FuelType.GAS;
                break;
        }
        Engine engine = new Engine(engineCapacity,fuelType);
        return engine;
    }
}

