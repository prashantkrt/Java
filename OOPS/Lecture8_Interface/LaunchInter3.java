package OOPS.Lecture8_Interface;

interface Calculator1 {
    void add(int num1, int num2);// public abstract void add()

    void sub(int num1, int num2);
}

interface Calculator2 {
    void mul(int num1, int num2);

    void div(int num1, int num2);
}

interface Many{
    float pi = 3.14f; // public static final float pi=3.14;
}

// class can implement multiple inheritance
class MyCalculator implements Calculator1, Calculator2,Many {

    public void add(int num1, int num2) {
        int res = num1 + num2;
        System.out.println("Sum of numbers " + res);
    }

    public void sub(int num1, int num2) {
        int res = num1 - num2;
        System.out.println("Subtraction of two numbers " + res);
    }

    public void mul(int num1, int num2) {
        int res = num1 * num2;
        System.out.println("Multiplication of two numbers " + res);
    }

    public void div(int num1, int num2) {
        int res = num1 / num2;
        System.out.println("Division of two numbers " + res);
    }
    public void display()
    {
        System.out.println("Value of the pi "+pi);
    }
}


public class LaunchInter3 {
    public static void main(String[] args) {
        MyCalculator cal = new MyCalculator();
        cal.add(1,2);
        cal.sub(2,1);
        cal.mul(2,3);
        cal.div(4,2);
    }
}
