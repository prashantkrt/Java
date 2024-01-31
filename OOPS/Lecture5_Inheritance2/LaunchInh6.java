package OOPS.Lecture5_Inheritance2;
class Demo{
    int a =10;
    void display()
    {
        System.out.println(a);
        System.out.println("Display of the parent");
    }
}
class Demo1 extends  Demo{
    int a;
    void display()
    {
        a=20;
        System.out.println(a);//20
        System.out.println(super.a);//10
        super.display();//10
    }
}

public class LaunchInh6 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.display();
    }
}
// super keyword always refer to the parent
// this refers to current object