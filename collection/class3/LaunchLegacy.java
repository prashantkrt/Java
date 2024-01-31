package collection.class3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//vector implements list interface
public class LaunchLegacy {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        System.out.println(v);
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();
        Enumeration element = v.elements();
        while (element.hasMoreElements())
            System.out.print(element.nextElement() + " ");
    }
}
