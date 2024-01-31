package OOPS.Lecture3_Static;

//static components are all object independent like variables , methods and blocks
// can be called directly with the class name
public class LaunchStatic1 {

    // static variables and blocks gets executed during class loading itself
    static int a;

    static {
        a = 10;
        System.out.println(a);
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}

/*
* main method is static because
* we don't need to create the object for that class
* jvm can directly call's the method with the class name
* Methods gets loaded when class is created hence jvm simply calls className.main
*
* */

// Java compiler will not allow non-static in static members
// however we can use static members  in non-static members
