package discovery.sealed;

public final class Bicycle extends Truck implements Vehicle {
    public void drive() {
        System.out.println("Driving bicycle");
    }
}
