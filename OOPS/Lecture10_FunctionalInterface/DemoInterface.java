package OOPS.Lecture10_FunctionalInterface;
// types of interface
/*
* Normal - > more than 1 method
* SAM -> (single abstract method) or from 1.8 functional interface -> one method
* Marker -> empty interface
* */
interface Mobile {
    void call();

    void message();
}

public class DemoInterface {
    public static void main(String[] args) {
        Mobile obj = new Mobile() {
            @Override
            public void call() {
                System.out.println("In call method");
            }

            @Override
            public void message() {
                System.out.println("In message method");
            }
        };
    }
}
