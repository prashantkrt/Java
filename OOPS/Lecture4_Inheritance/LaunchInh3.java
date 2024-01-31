package OOPS.Lecture4_Inheritance;

class AeroPlane {
    AeroPlane() {
        System.out.println("AeroPlane Constructor");
    }
}

class CargoPlane extends AeroPlane {
    // default constructor invoked and super method will call parent class constructor
}

public class LaunchInh3 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
    }
}


/* **imp
 * Constructor never participate in the inheritance
 * It gets executed because of super method present in child class
 * */