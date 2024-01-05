package factories;

import Cars.Car;
import Cars.ToyotaCar;
import Engines.Engine;
import Engines.ToyotaEngine;
import Tires.Tire;
import Tires.ToyotaTire;

public class ToyotaFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public Tire createTire() {
        return new ToyotaTire();
    }
}
