package Generics;

import java.util.ArrayList;
import java.util.List;

class Human2 {
    public void sleep() {
        System.out.println("Human needs to sleep");
    }
}

class Employee2 extends Human2 {
    @Override
    public void sleep() {
        System.out.println("Employee needs to sleep during office hours");
    }
}

class Student {

}

public class LaunchGenerics3 {
    public static void main(String[] args) {


        Object obj = new Object();
        String strObj = "Java";
        obj = strObj;

        Human2 human = new Human2();
        Employee2 emp = new Employee2();
        human = emp;


        ArrayList<Human2> humanList1 = new ArrayList<>();
        ArrayList<Employee2> employeeList2 = new ArrayList<>();
        // This will not work
        // humanList1 = employeeList2


        ArrayList<?> list = new ArrayList<>(); // ? is wildcard => unknown dataType
        ArrayList<Employee2> list2 = new ArrayList<>();
        list = list2;


        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l2.add(30);
        l2.add(40);
        l1 = l2;
        System.out.println(l1);
        System.out.println(l2);


        //Upper bound
        ArrayList<? extends Human2> ll1 = new ArrayList<>();
        //either Human2 or it's child
        //upper is Human2
        ArrayList<Employee2> ll2 = new ArrayList<>();
        ll1 = ll2;


        ArrayList<? extends Human2> lst1 = new ArrayList<>();
        ArrayList<Student> lst2 = new ArrayList<>();
        //will not work
        // lst1 = lst2;

        ArrayList<Object> c = new ArrayList<>();
        ArrayList<Student> s = new ArrayList<>();
        //not work
        //c=s;

        //lower bound
        ArrayList<? super Human2> humanList = new ArrayList<>(); // lower bound
        //only parent of Human2 or Human2
        // lowest is Human2
        ArrayList<Object> o = new ArrayList<>();
        humanList = o;

        ArrayList<Human2> h = new ArrayList<>();
        h.add(new Human2());
        h.add(new Human2());
        invokeSleep(h);

        ArrayList<Employee2> e = new ArrayList<>();
        e.add(new Employee2());
        invokeSleep3(e);
    }

    public static void invokeSleep(List<Human2> list) {
        for (Human2 o : list) {
           o.sleep();
        }
    }

    public static void invokeSleep2(List<?> list) {
        for (Object o : list) {
            System.out.println(o.getClass().getName());
        }
    }

    public static void invokeSleep3(List<? extends Human2> list) {
        for (Object o : list) {
            System.out.println();
        }
    }

    public static void invokeSleep4(List<? super Human2> list) {
        for (Object o : list) {
            System.out.println();
        }
    }
}
