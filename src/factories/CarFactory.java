package factories;

import Cars.Car;
import Engines.Engine;
import Tires.Tire;

public abstract class CarFactory {
    abstract Car createCar();

    abstract Engine createEngine();

    abstract Tire createTire();
}
