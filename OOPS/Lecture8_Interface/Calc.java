package OOPS.Lecture8_Interface;

interface Calc {
    void add(); // public abstract void add();

    public abstract void sub();
}

class MyCalc1 implements Calc {
    // must be public
    public void add() {
        int res = 10 + 4;
        System.out.println(res);
    }

    // must be public as we cannot reduce the visibility as interface methods are public
    public void sub() {
        int res = 10 - 4;
        System.out.println(res);
    }
}
class MyCalc2 implements Calc {

    // must be public
    public void add() {
        int a = 10;
        int b = 4;
        int res = a+b;
        System.out.println(res);
    }

    // must be public as we cannot reduce the visibility as interface methods are public
    public void sub() {
        int a = 10;
        int b = 4;
        int res = a-b;
        System.out.println(res);
    }
}

class LaunchInter {
    public static void main(String[] args) {
      MyCalc1 c1 = new MyCalc1();
      c1.add();
      c1.sub();
      MyCalc2 c2 = new MyCalc2();
      c2.add();
      c2.sub();
    }
}

