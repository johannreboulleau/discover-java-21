package discovery.sealed;

public sealed interface Vehicle permits AVehicle, Car, Truck, Bicycle {
    void drive();
}
