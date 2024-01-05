package factories;

import Cars.Car;
import Cars.MercedesCar;
import Engines.Engine;
import Engines.MercedesEngine;
import Tires.MercedesTire;
import Tires.Tire;

public class MercedesFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new MercedesCar();
    }

    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    public Tire createTire() {
        return new MercedesTire();
    }
}
