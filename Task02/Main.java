package OthertASKS.Task02;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Build your own car and try to achieve the longest distance");

        WheelLogic wheelLogic = new WheelLogic();
        Wheel wheel = wheelLogic.selectWheel();
        EngineLogic engineLogic = new EngineLogic();
        Engine engine = engineLogic.selectEngine();
        Fuel fuel = new Fuel(Fuel.fuelMax);
        Car car = new Car(engine, wheel, fuel);
        System.out.println("Your car" + car.toString());

        CarLogic carLogic = new CarLogic();

        boolean isCrashed = false;
        loop:
        while (isCrashed == false) {
            System.out.println("Now choose what would you want:" + "\n 1.Drive your car" + "\n 2.Go to Gas Station" + "\n 3.Check how many Gas Station left " + "\n 4.Check Fuel" + "\n 5.Change Wheel" + "\n 6.Quite");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Now choose what would you want:" + "\n 1.Drive your car" + "\n 2.Go to Gas Station" + "\n 3.Check how many Gas Station left " + "\n 4.Check Fuel" + "\n 5.Change Wheel" + "\n 6.Quite");
            }
            int firstChoice = sc.nextInt();
            switch (firstChoice) {
                case 1:
                    carLogic.LetsGo(car);
                    break;
                case 2:
                    carLogic.gasStation(car);
                    break;
                case 3:
                    carLogic.printGasStation();
                    break;
                case 4:
                    car.printFuel();
                    break;
                case 5:
                    carLogic.changeWheel(car);
                    break;
                case 6:
                    isCrashed = true;
                    break;
            }
        }
    }
}
