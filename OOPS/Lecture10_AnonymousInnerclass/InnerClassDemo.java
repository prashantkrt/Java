package OOPS.Lecture10_AnonymousInnerclass;

/*
 *  Member inner class
 *  Static Inner class
 *  Anonymous inner class
 * */
class A1 {
    int num = 9;

    public void show() {
        System.out.println("Something");
    }

    static class B {
        void doSomething() {
            System.out.println("do something");
        }
    }

    class C {
        void doMore() {
            System.out.println("Do more");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        A1 obj = new A1();

        // static
        A1.B obj1 = new A1.B();
        obj1.doSomething();

        // non static
        A1.C obj2 = obj.new C();
        obj2.doMore();
    }
}
