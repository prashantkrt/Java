package OOPS.Lecture10_AnonymousInnerclass;

abstract class ABC {
    public void show() {
        System.out.println("in a show");
    }
    public abstract void show2();
}

public class DemoAbstract {
    public static void main(String[] args) {
        ABC obj = new ABC() {
            public void show2() {
                System.out.println("in show 2");
            }
        };
        obj.show();
        obj.show2();
    }
}
