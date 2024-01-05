package Engines;

public class ToyotaEngine extends Engine {
    @Override
    public void horsepower() {
        System.out.println("Motor: ");
        System.out.println("140 cavalos");
    }

    @Override
    public void cylinderConfiguration() {
        System.out.println("L4");
    }
}
