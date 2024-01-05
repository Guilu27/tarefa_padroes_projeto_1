package factories;

import Cars.Car;
import Cars.ToyotaCar;
import Engines.Engine;
import Engines.ToyotaEngine;
import Tires.Tire;
import Tires.ToyotaTire;

public class ToyotaFactory extends CarFactory {
    @Override
    Car createCar() {
        return new ToyotaCar();
    }

    @Override
    Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    Tire createTire() {
        return new ToyotaTire();
    }
}
