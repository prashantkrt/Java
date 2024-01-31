package OOPS.Lecture7_Final;

class Alpha {
    public final float pi = 3.14f;
    public final void display() {
        System.out.println("Alpha ka display");
    }
}
    // cannot extend the final class
    // final variables can't be changed
class Beta extends Alpha {
    // final methods will participate in inheritance
    // however you cannot override it
}
    // abstract class cannot be final
public class LaunchFinal {
    public static void main(String[] args) {
    Beta b = new Beta();
    b.display();
    }
}
