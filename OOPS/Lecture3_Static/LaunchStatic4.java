package OOPS.Lecture3_Static;

class Demo3 {
    static void disp2() {
        System.out.println("static display method");
    }

    void disp1() {
        System.out.println("non static display method");
    }
}

public class LaunchStatic4 {
    public static void main(String[] args) {
        Demo3.disp2();
        Demo3 d = new Demo3();
        d.disp1();
        d.disp2(); // we can call it using object reference
    }
}
