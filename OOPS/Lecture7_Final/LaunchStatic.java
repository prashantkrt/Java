package OOPS.Lecture7_Final;
// method hiding
// learning the concept of method hiding
class Parent1 {
    static void disp() {
        System.out.println("static parent disp");
    }
}

class Child2 extends Parent1 {
    // it can participate in the inheritance however you cannot override it, so it cannot be abstract
    // this is specialized method for the child
    // it's looking like override but no it's created new method
    // this hides the parent static method
    static void disp() {
        System.out.println("static child disp");
    }
}

// static methods do get inherited
// however we cannot override the static methods
// called as method hiding
public class LaunchStatic {
    public static void main(String[] args) {
        Child2.disp();
        Child2 c = new Child2();
        c.disp();
    }
}
