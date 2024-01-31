package OOPS.Lecture10_FunctionalInterface;

interface Siri {
    void show();
}

interface POP {
    void bob();
}

@FunctionalInterface
interface Square{
    int squareNumber(int i);
}

public class FunctionalDemo {
    public static void main(String[] args) {
//       Siri obj = new Siri() {
//           public void show() {
//               System.out.println("In show");
//           }
//       };

        //lambda function
        Siri obj = () -> System.out.println("In show");

        POP obj1 = () ->System.out.println("bob the builder");

        Square obj2 = i -> i*i;
        System.out.println(obj2.squareNumber(3));

    }
}
