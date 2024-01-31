package collection.class3;

import java.util.ArrayDeque;
import java.util.Iterator;

public class LaunchIterator2 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(1);
        ad.add(2);
        ad.add(3);
        ad.add(4);
        ad.add(5);

        System.out.println(ad);

        Iterator itr = ad.iterator();

        while (itr.hasNext())
            System.out.print(itr.next());
    }
}
