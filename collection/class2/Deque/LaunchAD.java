package collection.class2.Deque;

import java.util.ArrayDeque;

// maintains the order
public class LaunchAD {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add("Java");
        ad.addFirst(1);
        ad.addLast(3);
        System.out.println(ad);

        ArrayDeque ad2 = new ArrayDeque();
        ad2.add(1);
        ad2.add(2);
        ad2.add(3);
        ad2.add(4);
        System.out.println(ad2);
    }
}
