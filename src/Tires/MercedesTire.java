package Tires;

public class MercedesTire extends Tire {
    @Override
    public void tireType() {
        System.out.println("Pneus da Michelin");
    }

    @Override
    public void tireSize() {
        System.out.println("Pneus 245/45R18");
    }
}
