package example.TimeExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeExample {
    public static void main(String[] args) {
        // example 1: show now datetime and change to timestamp.
        DateTimeTutorial.showNow();
        DateTimeTutorial.Instant2Timestamp();
        DateTimeTutorial.changeFormatFromDate();
    }
}

class DateTimeTutorial {
    public static void showNow() {
        // * show now time.
        //! 請注意格式差異 Instant, Date
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant + "; type: " + instant.getClass()); // Instant: 2021-10-08T06:03:55.600338Z; type: class java.time.Instant
    }

    public static void Instant2Timestamp() {
        // * instant to timestamp example.
        Instant instant = Instant.now();
        long timestamp = instant.getEpochSecond(); 
        System.out.println("timestamp: " + timestamp); // timestamp: 1633673035
    }

    public static void changeFormatFromDate() {
        DateFormat dateFormat = new SimpleDateFormat();
        Date date = new Date();
        String dateTimeNow = dateFormat.format(date);

        System.out.println("date: " + date + "; type: " + date.getClass()); // date: Fri Oct 08 14:03:55 CST 2021; type: class java.util.Date
        System.out.println("dateFormat: " + dateTimeNow + "; type: " + dateTimeNow.getClass()); // dateFormat: 2021/10/8 下午2:03; type: class java.lang.String
    }
}
