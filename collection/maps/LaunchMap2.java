package collection.maps;

import java.util.*;


public class LaunchMap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rohit");
        map.put(2, "Kohli");
        map.put(3, "Shami");
        map.put(4, "Bumrah");
        map.put(5, "Jadega");

        Collection values = map.values();

        Iterator itr = values.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next().toString().toUpperCase() + " ");
        }

        System.out.println();

        Set<Integer> key = map.keySet();
        for (int k : key)
            System.out.print(k + " ");

        System.out.println();

        Iterator it = key.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");

        System.out.println();

        for (int i : map.keySet())
            System.out.print(i + " ");

        System.out.println();
        //both Key and Value
        Set<Map.Entry<Integer, String>> entry = map.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.print(e.getKey() + " " + e.getValue() + " ");
        }

        System.out.println();

        Set entry1 = map.entrySet();
        Iterator itrr = entry1.iterator();
        while (itrr.hasNext()) {
            Map.Entry pair = (Map.Entry) itrr.next();
            System.out.print(pair.getKey() + " " + pair.getValue());
        }

    }
}
