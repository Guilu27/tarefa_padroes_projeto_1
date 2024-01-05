package factories;

import Cars.Car;
import Cars.MercedesCar;
import Engines.Engine;
import Engines.MercedesEngine;
import Tires.MercedesTire;
import Tires.Tire;

public class MercedesFactory extends CarFactory {
    @Override
    Car createCar() {
        return new MercedesCar();
    }

    @Override
    Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    Tire createTire() {
        return new MercedesTire();
    }
}
