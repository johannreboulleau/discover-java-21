package discovery.sealed;

public class SealedClassOrInterface {

    public void test(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            car.drive();
        } else if (vehicle instanceof Truck truck) {
            truck.drive();
        }
    }
}

final class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving car");
    }
}

sealed class Truck extends AVehicle implements Vehicle permits Bicycle {
}

abstract sealed class AVehicle implements Vehicle {
    public void drive() {
        System.out.println("Driving discovery.sealed.AVehicle");
    }
}
