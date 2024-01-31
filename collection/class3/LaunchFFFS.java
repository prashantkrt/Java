package collection.class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// FailFast FailSafe
public class LaunchFFFS {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // infinite loop
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//            list.add(i * 10);
//        }

        Iterator itr = list.iterator();

        // concurrentModificationException :-> called as failFast
//        while (itr.hasNext()) {
//            System.out.print(itr.next() + " ");
//            list.add(10);
//        }

        CopyOnWriteArrayList list3 = new CopyOnWriteArrayList();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(50);

        //failsafe : does not allow concurrent modification and will not generate exception
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
            list.add(i * 10);
        }

        Iterator itr2 = list3.iterator();
        while (itr2.hasNext()) {
            System.out.print(itr2.next() + " ");
            list3.add(10);
        }

    }
}
