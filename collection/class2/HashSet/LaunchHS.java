package collection.class2.HashSet;
// Internally using hashing
//searching o(1)
//HashSet is a class
// set is an interface
// order is not maintained
// unique elements

import java.util.HashSet;

public class LaunchHS {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        // Set s = new HashSet();  or this way

        set.add(10);
        set.add("J");
        set.add('K');
        set.add("Java");
        set.add(100);

        System.out.println(set);
    }
}
