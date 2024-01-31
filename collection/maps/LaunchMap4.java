package collection.maps;

import java.util.HashMap;

class Learner1 {
    int age;
    String name;

    Learner1() {

    }

    Learner1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void finalize() {
        System.out.println(" Object cleaning by the garbage collector");
    }
    //whatever task need to clean the garbage
    // task of the garbage collector to clean the heap area that code is written
    //inside to finalize() method.
    //Internally garbage collector invokes finalize method
    //GC is a demon thread which executes at last to clean the heap area
}

public class LaunchMap4 {
    public static void main(String[] args) {

        Learner1 learn1 = new Learner1(15, "Rohan");
        Learner1 learn2 = new Learner1(16, "Sachin");

        HashMap map = new HashMap<>();

        map.put(learn1, "DBG");
        map.put(learn2, "ABC");

        System.out.println(map);

        learn1=null;
        learn2=null;
        System.gc();//way to call the GC

        System.out.println(map); //hashmap dominates GC

        //gc NOT WORKING AS Hashmap contains the object
    }
}
