package collection.class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LaunchIterator {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


        Iterator itr = list.iterator(); //cursor -1

        System.out.println(itr.hasNext());
        System.out.println(itr.next()); // pos 0
        System.out.println(itr.next()); // pos 1
        System.out.println(itr.next()); // pos 2
        System.out.println(itr.next()); // pos 3

        System.out.println(itr.hasNext()); // check for pos 4 true
        System.out.println(itr.next()); // pos 4
        System.out.println(itr.hasNext()); // pos 5 false


        // using loop
        itr = list.iterator(); // resetting the cursor to -1 pos
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        // specific to list
        ListIterator litr = list.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next()+" ");
        }

        // difference is that we can perform index based traversing

        System.out.println();
        List l = new ArrayList();
        l.add(1); // pos 0
        l.add(2); // pos 1
        l.add(3); // pos 2
        l.add(4);
        l.add(5);

        litr = l.listIterator(2);// places cursor at pos 1
        while (litr.hasNext()) {
            System.out.print(litr.next()+" ");
        }

        System.out.println();
        ListIterator ll = l.listIterator(l.size());
        while (ll.hasPrevious()) {
            System.out.print(ll.previous()+" ");
        }

    }
}
