package ToBeRemembered.HashCodeAndEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Pen2 {
    int price;
    String color;

    public Pen2(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Pen2 that = (Pen2) o;
        return this.price == that.price && this.color.equals(that.color);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(price, color); // both way we can do hashCode generation
//    }
    @Override
    public int hashCode() {
        return (price + color).hashCode(); // will generate same hashcode for every object
    }
}

public class HashCodeAndEquals3 {
    public static void main(String[] args) {

        Pen2 p1 = new Pen2(10, "Blue");
        Pen2 p2 = new Pen2(10, "Blue");


        System.out.println(p2 == p1);

        System.out.println(p1.equals(p2));

        System.out.println(p1);
        System.out.println(p2);

        Set<Pen2> pens = new HashSet<>();

        pens.add(p1);
        pens.add(p2);

        System.out.println(pens);
    }
}
/*
Contract :-
 1 : If two objects are equal then they mush have the same hashCode.
 2 : If two objects have the same hashcode they may or may not be equal
* */



