import app.App;
import factories.CarFactory;
import factories.MercedesFactory;
import factories.ToyotaFactory;

public class Main {
    private static App configureApp(Boolean isLuxuryCar) {
        App app;
        CarFactory factory;

        if (isLuxuryCar) {
            factory = new MercedesFactory();
        } else {
            factory = new ToyotaFactory();
        }

        app = new App(factory);

        return app;
    }

    public static void main(String[] args) {
        App app = configureApp(true);

        app.createFullCar();

        app = configureApp(false);

        app.createFullCar();
    }
}
