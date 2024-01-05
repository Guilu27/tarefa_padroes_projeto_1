package Engines;

public class MercedesEngine extends Engine {
    @Override
    public void horsepower() {
        System.out.println("Motor: ");
        System.out.println("450 cavalos");
    }

    @Override
    public void cylinderConfiguration() {
        System.out.println("V6");
    }
}
