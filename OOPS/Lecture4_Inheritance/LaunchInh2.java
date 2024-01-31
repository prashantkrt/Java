package OOPS.Lecture4_Inheritance;

// multi level inheritance
class SuperHuman {  // extends Objects class
    // plus all the Objects methods
    void show() {
        System.out.println("Super Human");
    }
}
// Plus all the objects methods
// one method inherited i.e. show
class Human1 extends SuperHuman {
    int age;
    private int gender; // private variables won't participate in the inheritance

    void display() {
        System.out.println("Human class Method");
    }
}
// plus all the object methods
// two methods got inherited i.e. show and display
class Employee extends Human1 {
    void showAge() {
        age = 18;
        System.out.println(age);
    }
}

public class LaunchInh2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.showAge();
        e.display();
        e.show();
    }
}
