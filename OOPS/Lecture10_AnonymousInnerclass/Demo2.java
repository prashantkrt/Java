package OOPS.Lecture10_AnonymousInnerclass;

class P {
    public void show() {
        System.out.println("in P show");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        P obj = new P() {
            public void show() {
                System.out.println("its working");
            }
        };
        obj.show();
    }
}
