package DateAndTime;

public class LaunchDateTime1 {
    public static void main(String[] args) {
        // deprecated
        java.util.Date  d = new java.util.Date();
        System.out.println(d); // Thu Nov 23 12:08:03 IST 2023

        long timeInMs = d.getTime();
        System.out.println(timeInMs);

        java.sql.Date date2 = new java.sql.Date(timeInMs); //2023-11-28
        System.out.println(date2);
    }
}
