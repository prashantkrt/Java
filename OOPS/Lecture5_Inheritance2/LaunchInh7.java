package OOPS.Lecture5_Inheritance2;

class Human2 {

    void sleep() { // default

    }

    public int eat() {
        return -1;
    }
}

class Employee2 extends Human2 {

    public void sleep() {// public -> increasing the visibility
        // rule 1 : we cannot reduce visibility of the overridden methods
        // rule 2 : we can increase the visibility of the overridden methods
        // rule 3: if the parameters are not same then it will consider as specialised method
    }

    // now this is a specialized method it gets overloaded and doesn't override the parent method
    public void sleep(int a, int b) {

    }

    // rule 4 : we cannot change the return type for overridden methods
//    void eat()
//    {
//
//    }

}

public class LaunchInh7 {
    public static void main(String[] args) {

    }
}
//rule 1 : we cannot reduce visibility of the overridden methods
//rule 2 : we can increase the visibility of the overridden methods
//rule 3 : we cannot change the return type for overridden methods
//rule 4 : we can change the return type for overridden methods however to make this,
//the return type must be co-variant return type.(Is - A relationship must exist between return types)
//rule 5 : if parameter change then it will be specialized method for child class
//since it's overload instead of overriding