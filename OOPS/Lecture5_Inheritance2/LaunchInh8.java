package OOPS.Lecture5_Inheritance2;

class Plane{

}
class FighterPln extends Plane{

}
class Human3 {

    void sleep() {

    }

    public Plane eat() {
        System.out.println("Human needs to eat");
        Plane p = new Plane();
        return p;
    }
}

class Employee3 extends Human3 {

    public void sleep() {
    }

    // is a relationship should be there
    // called co-variant return type
    public FighterPln eat() {
        System.out.println("Human needs to eat");
        FighterPln p = new FighterPln();
        return p;
    }
    //we can change the return type for overridden methods however to make this,
    //the return type must be co-variant return type.
    //there should be Is-A relationship
}

public class LaunchInh8 {
    public static void main(String[] args) {

    }
}
//rule 1 : we cannot reduce visibility of the overridden methods
//rule 2 : we can increase the visibility of the overridden methods
//rule 3 : we cannot change the return type for overridden methods
//rule 4 : we can change the return type for overridden methods however to make this,
//the return type must be co-variant return type.
//(Is - A relationShip should be there )
//rule 5 : if parameter change then it will be specialized method for child class since it's overload instead of overriding