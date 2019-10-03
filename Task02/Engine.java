package OthertASKS.Task02;

public class Engine {
    private EngineCapacity engineCapacity;
    private FuelType fuelType;

    public Engine(EngineCapacity engineCapacity, FuelType fuelType) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    public EngineCapacity getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(EngineCapacity engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType=" + fuelType +
                '}';
    }
}

enum FuelType {
    Diesel,
    GAS;

}
enum EngineCapacity {
    LowEngineCapacity ("1.4"),
    LowEngineCapacity2 ("1.6"),
    MediumEngineCapacity ("2.0"),
    NotEnoughEngineCapacity ("2.5"),
    HighEngineCapacity ("3.0"),
    NeedMore ("3.5"),
    FuckFuelEconomy ("5.5");

    private String title;

    EngineCapacity(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "EngineCapacity{" +
                "title='" + title + '\'' +
                '}';
    }
}


