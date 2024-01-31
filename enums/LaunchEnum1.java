package enums;

enum Week {
    MON, TUE, WED, THUS, FRI, SAT, SUN;
}

public class LaunchEnum1 {
    enum Direction {
        NORTH, EAST, WEST, SOUTH;
    }

    public static void main(String[] args) {
        Week w = Week.MON;
        Direction d = Direction.NORTH;
        System.out.println(w);
        System.out.println(d);

        int index = Week.SAT.ordinal();
        System.out.println(index);

        Week[] arr = Week.values();
        for (Week a : arr)
            System.out.print(a + " ");
        System.out.println();
        for (Week a : arr)
            System.out.print(a.ordinal() + " ");
    }

}
