package OOPS.Lecture2_Constructor;

class Student2 {
    private int id;
    private String name;
   // *** one constructor calling another constructor called constructor chaining
    public Student2(int id, String name) {
        //super(); // if we use this then super won't be there
        this(); // calls the constructor of the same class
        this.id = id;
        this.name = name;
        System.out.println("parameterized constructor");
    }

    // constructor overloading
    public Student2() {
        //super();
        this(1);
        System.out.println("Zero parameterized constructor");
    }

    public Student2(int id) {
        //super();
        System.out.println("one parameterized constructor");
    }
}

public class LaunchCons3 {
    public static void main(String[] args) {
        Student2 st1 = new Student2(1, "Rohan");
        Student2 st2 = new Student2();
        // error as now default constructor won't get invoked once developer added the constructor
        // for removing error include constructor
    }
}
