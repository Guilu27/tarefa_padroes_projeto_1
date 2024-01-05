package app;

import Cars.Car;
import Engines.Engine;
import Tires.Tire;
import factories.CarFactory;

public class App {
    private Car car;
    private Engine engine;
    private Tire tire;

    public App(CarFactory factory) {
        this.car = factory.createCar();
        this.engine = factory.createEngine();
        this.tire = factory.createTire();
    }

    public void createFullCar() {
        car.carModel();
        engine.horsepower();
        engine.cylinderConfiguration();
        tire.tireType();
        tire.tireSize();
    }
}
