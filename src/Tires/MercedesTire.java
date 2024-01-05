package Tires;

public class MercedesTire extends Tire {
    @Override
    public void tireType() {
        System.out.println("Pneus: ");
        System.out.println("Michelin");
    }

    @Override
    public void tireSize() {
        System.out.println("245/45R18");
    }
}
