package OOPS.Lecture3_Static;

class Demo2 {
    int a, b;
    static int count=0;

    Demo2() {
        System.out.println("Constructor1");
        count++;
    }

    Demo2(int a) {
        this.a = a;
        System.out.println("Constructor2");
        count++;
    }

    Demo2(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor3");
        count++;
    }
}
// how many object created ?

/*
* common data needs to be shared among all the object then go for static variables
* class level and object independent
* memory allocated only once
* */
public class LaunchStatic3 {
    public static void main(String[] args) {
        Demo2 d1= new Demo2();
        Demo2 d2= new Demo2(10);
        Demo2 d3= new Demo2(10,20);
        System.out.println(Demo2.count); // one copy variable since it's class dependent
    }
}
