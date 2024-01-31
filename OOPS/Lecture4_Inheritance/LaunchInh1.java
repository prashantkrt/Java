package OOPS.Lecture4_Inheritance;
//parent class//base class // super class
class Human {
    void sleep() {
        System.out.println("Human needs sleep");
    }
}
// child class // sub class //derived class
class Student extends Human {

}

// Student is a Human
// think of Is a relationship to achieve the inheritance
public class LaunchInh1 {
    public static void main(String[] args) {
        // code re-usability
        Student std = new Student();
        std.sleep();
    }
}
