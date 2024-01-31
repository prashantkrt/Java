package Generics;

import java.util.ArrayList;
import java.util.List;

class Human {
    public void sleep() {

        System.out.println("Human needs to sleep");
    }
}

//employee is a Human
class Employee extends Human {


}

public class LaunchCollection {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human());
        list.add(new Employee());
    }
}
