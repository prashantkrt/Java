package OOPS.Lecture8_Interface;

interface Shapes {
    void input();

    void compute();

    void display();

    void show();
}

interface Alpha{
    //tagged//marker
}

class Shaping {
    public void show() {
        System.out.println("Show Method of the Shaping class");
    }
}

// show method already inherited
class Rectangle extends Shaping implements Shapes {

    public void input() {

    }


    public void compute() {

    }


    public void display() {

    }
}

public class LaunchInter5 {
    public static void main(String[] args) {

    }
}
