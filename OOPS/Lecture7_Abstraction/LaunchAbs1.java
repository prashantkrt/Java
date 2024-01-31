package OOPS.Lecture7_Abstraction;

// we cannot make variable abstract
abstract class Flight {
    public static void landing() {
        System.out.println("Flight is landing");
    }

    abstract public void takeOff();

    abstract public void fly();
}

class CargoFlight extends Flight {
    public void takeOff() {
        System.out.println("CargoFlight is taking off");
    }

    public void fly() {
        System.out.println("CargoFlight is flying at lower heights");
    }
}

class PassengerFlight extends Flight {

    public void takeOff() {
        System.out.println("Passenger flight is taking off");
    }

    public void fly() {
        System.out.println("Passenger Flight is flying at higher heights");
    }
}

public class LaunchAbs1 {
    public static void main(String[] args) {
        // we cannot create object for abstract class
        // cannot be instantiated(Object cannot be created)
        // it's child class responsibility of child for implementation of the abstract class
        // reference variable can be created to achieve polymorphism
        // if child class extends abstract class and doesn't implement the abstract methods then it should be declared as abstract class
        // we cannot make variable abstract
        // constructor cannot be abstract.
        // Abstract classes can have constructors, but they cannot be instantiated directly. The constructors are used when a concrete subclass is created.
        Flight f1 = new CargoFlight();
        Flight f2 = new PassengerFlight();
    }
}

// Abstract class cannot be final
// Abstract method cannot be final
// Abstract method cannot be static , it should be specific to class which extends it

/*
 *
 * Interface:                                            Abstract class
 * fully abstractions                                 partial implementation
 * Variables are public static and final              variables can be static, non-static, final & non-final
 * Variables should be initialized                    Not required
 * cannot define blocks                               can define static and non-static blocks
 * cannot define constructors                         Can define constructors
 * */