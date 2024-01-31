package ExceptionalHandling;

class Demo {
    public void alpha() {
        System.out.println("In Method of Alpha");
        alpha();
    }
}

public class LaunchEH4 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try {
            obj.alpha();
        } catch (StackOverflowError e) {
            System.out.println("Stack Over flow");
        }
    }
}
