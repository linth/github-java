package example.TimeExample;

import java.time.ZoneOffset;
import java.util.Date;

/**
 * Date & Instant
 * 
 * Instant:
 *  - atOffset
 *  - atZone
 * 
 * Reference:
 *  - https://dotblogs.com.tw/duke/2019/12/13/151221
 */
public class DateAndInstantExample {
    public static void main(String[] args) {
        DateToInstant();
    }

    public static void DateToInstant() {
        Date date = new Date();
        System.out.println("date: " + date);
        System.out.println("instant: " + date.toInstant());

        // TODO: try the instant's function.
        System.out.println(date.toInstant().atOffset(ZoneOffset.UTC));
        System.out.println(date.toInstant());
    }
}
