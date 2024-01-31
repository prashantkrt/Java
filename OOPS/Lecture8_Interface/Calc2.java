package OOPS.Lecture8_Interface;

public interface Calc2 {
    void mul();
    void div();
}
// if not implementing the methods needs to declare class as abstract
abstract class MyCalc implements Calc2{

    public void mull()
    {
        System.out.println("Multiplication");
    }
}
class LaunchInter2{
    public static void main(String[] args) {

    }
}
