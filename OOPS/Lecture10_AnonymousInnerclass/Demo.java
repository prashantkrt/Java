package OOPS.Lecture10_AnonymousInnerclass;

interface A {
    void show();
}

class B implements A {
    public void show() {
        System.out.println("In B show");
    }
}

class Iphone15 {
    void show() {
        System.out.println("Iphone15 + Extra price than 14 pro");
    }
}
// we are creating new class simply to use extra features there in show
class Iphone15ProExtra extends Iphone15 {
    void show() {
        System.out.println("Iphone 15 pro + extra prices + extra USB-C port");
    }
}

public class Demo {
    public static void main(String[] args) {
//        A obj = new B();
//        obj.show();

        // if you want to get extra feature don't extend and create new child class
        // instead use anonymous inner class.
        Iphone15 obj1 = new Iphone15(){
            void show() {
                System.out.println("my function check...");
            }
        };
        obj1.show();
    }
}
