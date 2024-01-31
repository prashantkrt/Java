package collection.class4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LaunchFE {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(20);
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(40);

        System.out.println(list);

        List<Integer> list2 = Arrays.asList(70, 80, 90, 100);
        System.out.println(list2);


//        for (Integer l : list2)
//            System.out.print(l + " ");


        // foreach loop expects Consumer interface
        // Consumer obj = ()->{}  like this

        Consumer<Integer> o = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        //simplified
        Consumer<Integer> obj = (Integer i) -> {
            Integer j = i * i;
            System.out.println(j);
        };

        list2.forEach(obj);


        // more simplified
        Consumer<Integer> ob = (Integer i) -> System.out.print(i+" ");
        list2.forEach(ob);

        System.out.println();
        list2.forEach((n) -> {
            System.out.print(n + " ");
        });


        // better
        list2.forEach(i-> System.out.print(i+" "));
    }
}
