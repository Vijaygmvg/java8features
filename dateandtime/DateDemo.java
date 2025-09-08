package dateandtime;

import java.time.LocalDate;

public class DateDemo {
   public static void main(String[] args) {
    LocalDate now=LocalDate.now();
    System.out.println(now);

    LocalDate myDate=LocalDate.of(1990,2,23);
    System.out.println(myDate.getDayOfMonth());

    LocalDate yesterday=now.minusDays(1);
    System.out.println(yesterday+(now.isAfter(yesterday)?"before":"after")+now);
   } 
}
