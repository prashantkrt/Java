package collection.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Learner {
    int age;
    String name;

    Learner() {

    }

    Learner(int age, String name) {
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
}

public class LaunchMap1 {
    //Key should be unique and values can be repeated
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(1, "Virat"); // key value pair => 1 entry
        hm1.put(2, "Rahul"); // key value pair => 1 entry
        hm1.put(3, "Shami"); // key value pair => 1 entry
        hm1.put(4, "Rohit"); // key value pair => 1 entry

        Learner learn = new Learner();
        hm1.put(learn, "Prashant");
        hm1.put(null, learn);//null key is allowed in HashMap and also in value it can be null
        System.out.println(hm1);


        //order maintained
        //null key is allowed in HashMap and also in value it can be null
        LinkedHashMap lhm1 = new LinkedHashMap();
        lhm1.put(1, "Virat"); // key value pair => 1 entry
        lhm1.put(2, "Rahul"); // key value pair => 1 entry
        lhm1.put(3, "Shami"); // key value pair => 1 entry
        lhm1.put(4, "Rohit"); // key value pair => 1 entry

        System.out.println(lhm1); //order is maintained

        //sorts based on the key
        TreeMap tm = new TreeMap();
        tm.put(4, "Shami");
        tm.put(2, "Rohit"); // null as a value is allowed but
        tm.put(3, "Kohli"); // null key is not allowed in TreeMap
        System.out.println(tm);

        // null is not allowed
        // null as a value is allowed
        // null key is not allowed
        // hashtable is thread safe
        Hashtable ht = new Hashtable();
        ht.put(1, "Kohli");
        ht.put(2, "Rohit");
        ht.put(3, "Iyer");
        ht.put(4, "Shami");
    }
}
