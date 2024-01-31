package OOPS.Lecture4_Inheritance;

class AeroPlane1 {

    void takeoff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }
}

class CargoPlane1 extends AeroPlane1 {
    void fly() {
        System.out.println("CargoPlane flies at lower heights");
    }

    void landing() {
        System.out.println("CargoPlane is landing");
    }
}

public class LaunchInh5 {
    public static void main(String[] args) {
        AeroPlane1 cp = new CargoPlane1(); //up-casting
        cp.takeoff();
        cp.fly();
        ((CargoPlane1) cp).landing(); // down-casting for specialized methods
    }
}
