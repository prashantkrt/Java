package collection.class4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaunchCollection {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(100);
        list.add(3);
        list.add(44);
        list.add(8);
        list.add(90);
        System.out.println(list);

        //Collections is a utility class
        //Collection is an interface
        Collections.sort(list);
        System.out.println(list);

        Collections.rotate(list, 2);
        System.out.println(list);
        Collections.sort(list);

        Collections.rotate(list, list.size() - 1);
        System.out.println(list);
        Collections.rotate(list, -1);

        Collections.shuffle(list); // random order
        System.out.println(list);

        System.out.println(Collections.frequency(list, 44));
    }
}

/*
 * Collection:-(Interface)
 * Group of objects
 * It's an interface which has classes to collect the group of objects*
 * */
