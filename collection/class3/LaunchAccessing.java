package collection.class3;

import java.util.*;

public class LaunchAccessing {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(Object ob : list)
            System.out.print(ob+" ");


        System.out.println();
        Queue q = new ArrayDeque();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        for(Object queue : q)
            System.out.print(queue+" ");

    }
}
