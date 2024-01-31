package ToBeRemembered.HashCodeAndEquals;

class Pen1 {
    int price;
    String color;

    public Pen1(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Pen1 that = (Pen1) o;
        return this.price == that.price && this.color.equals(that.color);
    }
}

public class HashCodeAndEquals2 {
    public static void main(String[] args) {

        Pen1 p1 = new Pen1(10, "Blue");
        Pen1 p2 = new Pen1(10, "Blue");

        // it does reference comparison
        System.out.println(p2 == p1); // false

        // overridden the equals' method of Object class
        System.out.println(p1.equals(p2)); // true

        System.out.println(p1);
        System.out.println(p2);
    }
}

//  By default, in Object class
//    public int hashCode()
//    {
//
//    }
//
//
//    public boolean equals(Object obj)
//    {
//        return this==obj;
//    }



