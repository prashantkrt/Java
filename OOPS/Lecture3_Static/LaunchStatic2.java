package OOPS.Lecture3_Static;


class Demo {
    static int a, b; // gets life when we created the class or loaded the class

    //only one this which gets invoked while class loading or initialization itself
    //static initialization block
    static {
        a = 10;
        b = 20;
        System.out.println("static initialization block");
    }

    int x, y; // gets the life when object is created

    //initialization block
    {
        x = 30;
        y = 40;
        System.out.println("Java non static initialization block");
    }

    Demo() {
        //initialization block brought here first
        //super() second
        System.out.println("Constructor");
    }

    // methods are in our control
    // this won't execute until we call it
    static void display1() {
        System.out.println("static display method");
        System.out.println(a);
        System.out.println(b);
    }

    void display2() {
        System.out.println("non static display method");
        System.out.println(x);
        System.out.println(y);
    }
}

public class LaunchStatic2 {
    public static void main(String[] args) {
        Demo d = new Demo();

        //static components are object independent
        Demo.display1();
        d.display2();
    }
}

/*
 * main method is static because
 * we don't need to create the object for that class
 * jvm can directly call's the method with the class name
 * Methods gets loaded when class is created hence jvm simply calls className.main
 *
 * */


// note : static variables and block has memory and works in heap memory

// Java compiler will not allow non-static in static members
// however we can use static members  in non-static members