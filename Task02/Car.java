package OthertASKS.Task02;

import java.util.Objects;

public class Car {
    private Engine engine;
    private Wheel wheel;
    private Fuel fuel;
//    private String carModel;

    public Car(Engine engine, Wheel wheel, Fuel fuel) {
        this.engine = engine;
        this.wheel = wheel;
        this.fuel = fuel;
//        this.carModel = carModel;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

//    public String getCarModel() {
//        return carModel;
//    }

//    public void setCarModel(String carModel) {
//        this.carModel = carModel;
//    }


    public Engine getEngine() {

        return engine;
    }

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public Wheel getWheel() {

        return wheel;
    }

    public void printFuel (){
        System.out.println(fuel.toString());
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void printEngine() {
        System.out.println(engine);
    }

    public void printWheel() {
        System.out.println(engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getEngine().equals(car.getEngine()) &&
                getWheel().equals(car.getWheel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEngine(), getWheel());
    }
}
