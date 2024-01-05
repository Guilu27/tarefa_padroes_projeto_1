package factories;

import Cars.Car;
import Engines.Engine;
import Tires.Tire;

public abstract class CarFactory {
    public abstract Car createCar();

    public abstract Engine createEngine();

    public abstract Tire createTire();
}
