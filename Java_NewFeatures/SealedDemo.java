package Java_NewFeatures;

// what if we want to restrict to extend class A to only  B and C not to D
// sealed Vehicle permits Car.
// Car extends Vehicle(is-a)
// Human : object of vehicle(has-a)
sealed class Vehicle permits Car, Bike {
    void drive() {
        System.out.println("Vehicle");
    }
}

sealed class Car extends Vehicle permits BMW {

}

final class BMW extends Car {

}

sealed class Bike extends Vehicle permits Hayabusha {
    void drive() {
        System.out.println("Bike");
    }
}

non-sealed class Hayabusha extends Bike {

}

class Haya extends Hayabusha {

}

class Human {

}

class Donkey {

}

public class SealedDemo {
    public static void main(String[] args) {

    }
}
