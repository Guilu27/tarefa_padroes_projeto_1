package app;

import Cars.Car;
import Engines.Engine;
import Tires.Tire;

public class App {
    private Car car;
    private Engine engine;
    private Tire tire;

    public void createFullCar() {
        car.carModel();
        engine.horsepower();
        engine.cylinderConfiguration();
        tire.tireType();
        tire.tireSize();
    }
}
