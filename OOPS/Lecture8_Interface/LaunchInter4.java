package OOPS.Lecture8_Interface;

interface Super {
    void show(); // public abstract
}

// now show method got inherited to demo
interface Demo extends Super {
    void disp();
}

// now here both have to implemented since Demo extends Super
class Demo44 implements Demo {

    public void show() {
        System.out.println("In show method");
    }

    public void disp() {
        System.out.println("In disp method");
    }

    //specialized method for Demo44
    public void java(){
        System.out.println("In java method");
    }
}

public class LaunchInter4 {
    public static void main(String[] args) {
        Super s = new Demo44();
        s.show();
        Demo d = new Demo44();
        d.show();
        d.disp();
    }
}
