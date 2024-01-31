package collection.class2;

import java.util.LinkedList;

public class LaunchC {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add('J');
        list.add("Java");
        list.add(44.9);

        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peekFirst());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
        System.out.println(list);

        list.offer(11);
        list.offer(23);
        list.offerLast(23);
        list.offerFirst(22);
        list.remove("Java");

        list.push(10);
        list.push(12);
        list.pop();

        list.addFirst(12);
        list.addLast(23);
        System.out.println(list);
    }
}
