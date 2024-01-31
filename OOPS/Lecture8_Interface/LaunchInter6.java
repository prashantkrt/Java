package OOPS.Lecture8_Interface;
interface  Beta
{
    // all methods are public abd abstract
    //---------------------------------------

    // but now from java 8 interface can have method implementation
    // this default is different
    // default is a keyword which is not as access specifier like default
    default void display()
    {
        System.out.println("implemented method of an interface");
    }
}

class AlphaBeta implements Beta{
    // we can also override but not mandatory
    public void display()
    {

    }

    void show()
    {

    }
}
public class LaunchInter6 {
    public static void main(String[] args) {
      AlphaBeta a = new AlphaBeta();
    }
}
