package OOPS.Lecture4_Inheritance;

class Plane {
    Plane() {
        System.out.println("AeroPlane Constructor");
    }
}

class CarrierPlane extends Plane {
    // default constructor invoked and super method will call parent class constructor
    CarrierPlane() {
        super();// by default, it's there
    }
}

public class LaunchInh4 {
    public static void main(String[] args) {
        CarrierPlane cargo = new CarrierPlane();
    }
}
