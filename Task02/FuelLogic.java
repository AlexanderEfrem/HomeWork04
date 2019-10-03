package OthertASKS.Task02;
//this class was created just for fun to calculate how car will spend fuel

public class FuelLogic {

    private double wheelRatioMain;
    private double averageMPG;


    public double wheelRatioMain(Car car) {

        if (car.getWheel().getRadius() == Radius.R15) {
            this.wheelRatioMain = 0.98;
        }
        if (car.getWheel().getRadius() == Radius.R16) {
            this.wheelRatioMain = 0.99;
        }
        if (car.getWheel().getRadius() == Radius.R17) {
            this.wheelRatioMain = 1.0;
        }
        if (car.getWheel().getRadius() == Radius.R18) {
            this.wheelRatioMain = 0.98;
        }
        if (car.getWheel().getRadius() == Radius.R19) {
            this.wheelRatioMain = 0.96;
        }
        if (car.getWheel().getRadius() == Radius.R20) {
            this.wheelRatioMain = 0.98;
        }
        if (car.getWheel().getRadius() == Radius.R21) {
            this.wheelRatioMain = 0.97;
        }
        if (car.getWheel().getRadius() == Radius.R22) {
            this.wheelRatioMain = 0.91;
//            but they look cool
        }
        return wheelRatioMain;
    }

    public double wheelRatioSecond(Car car) {
        if (car.getEngine().getEngineCapacity() == EngineCapacity.LowEngineCapacity) {
            if (wheelRatioMain(car) == 1.0 || wheelRatioMain(car) == 0.99) {
                this.wheelRatioMain = wheelRatioMain(car) * 1.02;
            } else if (wheelRatioMain(car) == 0.91 || wheelRatioMain(car) == 0.97) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.67;
                System.out.println("I think, you should change something in your car");
            } else {
                this.wheelRatioMain = wheelRatioMain(car) * 0.98;
            }
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.LowEngineCapacity2) {
            if (wheelRatioMain(car) == 1.0 || wheelRatioMain(car) == 0.99) {
                this.wheelRatioMain = wheelRatioMain(car) * 1.02;
            } else if (wheelRatioMain(car) == 0.91 || wheelRatioMain(car) == 0.97) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.79;
            } else {
                this.wheelRatioMain = wheelRatioMain(car) * 1.00;
            }
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.MediumEngineCapacity) {
            if (wheelRatioMain(car) == 1.0 || wheelRatioMain(car) == 0.99) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.95;
            } else if (wheelRatioMain(car) == 0.91 || wheelRatioMain(car) == 0.97) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.93;
            } else {
                this.wheelRatioMain = wheelRatioMain(car) * 1.00;
            }
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.NotEnoughEngineCapacity) {
            if (wheelRatioMain(car) == 1.0 || wheelRatioMain(car) == 0.99) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.90;
            } else if (wheelRatioMain(car) == 0.91 || wheelRatioMain(car) == 0.97) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.96;
            } else {
                this.wheelRatioMain = wheelRatioMain(car) * 1.05;
            }
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.HighEngineCapacity) {
            if (wheelRatioMain(car) == 1.0 || wheelRatioMain(car) == 0.99) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.90;
            } else if (wheelRatioMain(car) == 0.91 || wheelRatioMain(car) == 0.97) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.99;
            } else {
                this.wheelRatioMain = wheelRatioMain(car) * 1.04;
            }
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.NeedMore) {
            if (wheelRatioMain(car) == 1.0 || wheelRatioMain(car) == 0.99) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.90;
            } else if (wheelRatioMain(car) == 0.91 || wheelRatioMain(car) == 0.97) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.99;
            } else {
                this.wheelRatioMain = wheelRatioMain(car) * 1.01;
            }
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.FuckFuelEconomy) {
            if (wheelRatioMain(car) == 1.0 || wheelRatioMain(car) == 0.99) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.43;
            } else if (wheelRatioMain(car) == 0.91 || wheelRatioMain(car) == 0.97) {
                this.wheelRatioMain = wheelRatioMain(car) * 0.84;
            } else {
                this.wheelRatioMain = wheelRatioMain(car) * 0.94;
            }
        }
        return this.wheelRatioMain;
    }

    public double wheelRatioThird(Car car) {
        if (car.getEngine().getFuelType() == FuelType.Diesel) {
            this.wheelRatioMain = wheelRatioSecond(car) * 1.2;
        } else {
            this.wheelRatioMain = wheelRatioSecond(car) * 1.0;
        }
        return this.wheelRatioMain;
    }

    public double wheelRatioFinal(Car car) {
        if (car.getWheel().getSeason() == Season.WINTER) {
            this.wheelRatioMain = wheelRatioThird(car) * 0.95;
        } else if (car.getWheel().getSeason() == Season.AllSEASONS) {
            this.wheelRatioMain = wheelRatioThird(car) * 0.97;
        } else {
            this.wheelRatioMain = wheelRatioThird(car) * 1.00;
        }
        return wheelRatioMain;
    }


    public double calculateAverageMVP(Car car) {
        if (car.getEngine().getEngineCapacity() == EngineCapacity.LowEngineCapacity) {
            this.averageMPG = 9.0;
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.LowEngineCapacity2) {
            this.averageMPG = 9.5;
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.MediumEngineCapacity) {
            this.averageMPG = 9.8;
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.NotEnoughEngineCapacity) {
            this.averageMPG = 10.2;
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.HighEngineCapacity) {
            this.averageMPG = 10.5;
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.NeedMore) {
            this.averageMPG = 11.3;
        }
        if (car.getEngine().getEngineCapacity() == EngineCapacity.FuckFuelEconomy) {
            this.averageMPG = 15.0;
        }
        return averageMPG;
    }

}
