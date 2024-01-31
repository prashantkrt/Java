package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//  joda.org
public class LaunchDateTime2 {
    public static void main(String[] args) {
//      LocalDate and LocalDateTime we cannot directly get
//      LocalDate date = new LocalDate();
        LocalDate date = LocalDate.now();
        System.out.println(date); //2023-11-28

        int dayOfTheMonth = date.getDayOfMonth();
        System.out.println(dayOfTheMonth);

        int month = date.getMonth().getValue();
        System.out.println(month);

        int month1 = date.getMonthValue();
        System.out.println(month1);

        int year = date.getYear();
        System.out.println(year);

        System.out.println("Day of the month " + LocalDate.now().getDayOfMonth());
        System.out.println("Day of the year " + LocalDate.now().getDayOfYear());

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);//2023-11-28T11:47:06.771850

        LocalTime t = LocalTime.now();
        System.out.println(t);// 11:47:59.588886

        System.out.println(t);
        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
    }
}
