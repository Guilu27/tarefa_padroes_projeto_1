package Tires;

public class ToyotaTire extends Tire {
    @Override
    public void tireType() {
        System.out.println("Pneus: ");
        System.out.println("Bridgestone");
    }

    @Override
    public void tireSize() {
        System.out.println("205/55R16");
    }
}
