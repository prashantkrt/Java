package OOPS.Lecture6_Polymorphism;

// Has-A relation

/*
 * 1:many
 * */


class Flight {
    public void takeOff() {
        System.out.println("Flight is taking off");
    }

    public void fly() {
        System.out.println("Flight is flying");
    }
}

class PassengerFlight extends Flight {
    public void takeOff() {
        System.out.println("Passenger Flight is taking off");
    }

    public void fly() {
        System.out.println("Passenger Flight is flying in lower altitude");
    }
}

class FighterPlane extends Flight {
    public void takeOff() {
        System.out.println("Fighter plane taking off");
    }

    public void fly() {
        System.out.println("Fighter plane is flying in higher altitude");
    }
}

public class LaunchPoly1 {
    public static void main(String[] args) {

        Flight flight = new Flight();
        flight.takeOff();
        flight.fly();
        PassengerFlight pf = new PassengerFlight();
        pf.takeOff();
        pf.fly();
        FighterPlane fp = new FighterPlane();
        fp.takeOff();
        fp.fly();

        // polymorphism
        flight = pf;
        flight.takeOff();
        flight.fly();

        flight = fp;
        flight.takeOff();
        flight.fly();

        Flight f = new PassengerFlight();
        Flight f2 = new FighterPlane();

        /*
         * Parent class reference must be there
         * Overriding concept must be there
         * */

        // for specialized method we have use the particular object of that class
    }
}


/*
 * Parent class reference must be there
 * Overriding concept must be there
 * */