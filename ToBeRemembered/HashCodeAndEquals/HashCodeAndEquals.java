package ToBeRemembered.HashCodeAndEquals;

class Pen {
    int price;
    String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }
}

public class HashCodeAndEquals {
    public static void main(String[] args) {

        Pen p1 = new Pen(10, "Blue");
        Pen p2 = new Pen(10, "Blue");

        // it does reference comparison
        System.out.println(p2 == p1); // false
        System.out.println(p1.equals(p2)); // false
        System.out.println(p1);
        System.out.println(p2);

        // we need to override equals method to content comparison
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



