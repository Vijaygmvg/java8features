package dateandtime;

import java.time.LocalTime;

public class TimeDemo {

    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalTime custom=LocalTime.of(10,23,23,432);

        LocalTime minusTime=time.minusHours(3);
        System.out.println(custom);
        System.out.println(minusTime);
    }
    
}
