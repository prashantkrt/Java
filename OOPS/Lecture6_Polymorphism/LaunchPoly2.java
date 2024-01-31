package OOPS.Lecture6_Polymorphism;

class Flight1 {
    public void takeOff() {
        System.out.println("Flight is taking off");
    }

    public void fly() {
        System.out.println("Flight is flying");
    }
}

class PassengerFlight1 extends Flight1 {
    public void takeOff() {
        System.out.println("Passenger Flight is taking off");
    }

    public void fly() {
        System.out.println("Passenger Flight is flying in lower altitude");
    }
}

class FighterPlane1 extends Flight1 {
    public void takeOff() {
        System.out.println("Fighter plane taking off");
    }

    public void fly() {
        System.out.println("Fighter plane is flying in higher altitude");
    }
}

class Airport {
    public void permit(Flight1 flight) {
        flight.takeOff();
        flight.fly();
    }
}

public class LaunchPoly2 {
    public static void main(String[] args) {
        Flight1 flight = new Flight1();

        PassengerFlight1 pf = new PassengerFlight1();

        FighterPlane1 fp = new FighterPlane1();

        Airport a = new Airport();
        
        a.permit(flight);
        a.permit(pf);
        a.permit(fp);
    }
}
