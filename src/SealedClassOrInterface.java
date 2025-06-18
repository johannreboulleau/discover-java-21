

public class SealedClassOrInterface {

    void test(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            car.drive();
        } else if (vehicle instanceof Truck truck) {
            truck.drive();
        }
    }
}

sealed interface Vehicle permits AVehicle, Car, Truck, Bicycle {
    void drive();
}

final class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving car");
    }
}

sealed class Truck extends AVehicle implements Vehicle {
}

abstract sealed class AVehicle implements Vehicle {
    public void drive() {
        System.out.println("Driving AVehicle");
    }
}

final class Bicycle extends Truck implements Vehicle {
    public void drive() {
        System.out.println("Driving bicycle");
    }
}