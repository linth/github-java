package example.TimeExample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * References:
 *  - https://medium.com/i18n-and-l10n-resources-for-developers/how-can-i-get-the-current-date-and-time-in-utc-or-gmt-in-java-5edf2fa2fd2
 *  - https://www.baeldung.com/current-date-time-and-timestamp-in-java-8
 */
public class DateTimeExample {
    private Date date = new Date(); // local time.
    private Instant instant = Instant.now(); // utc.

    public static void main(String[] args) {
        //! 請注意格式差異 Instant, Date
        DateTimeExample dateTimeExample = new DateTimeExample();

        // example 1: using Date().
        dateTimeExample.basicDateHandling();

        // example 2: change time zone.
        dateTimeExample.changeTimeZoneEx();

        // instant example.
        dateTimeExample.basicInstantHandling();

        // TODO: need to do.
        // example 1: show now datetime and change to timestamp.
        // DateTimeTutorial.showNow();
        // DateTimeTutorial.Instant2Timestamp();
        // DateTimeTutorial.changeFormatFromDate();

        // DateHandler.toResult();
        // DateHandler.subtractionOneHour();
    }

    public void basicDateHandling() {
        System.out.println("Local now: " + date); // example: Wed Oct 13 11:38:56 CST 2021, (not UTC).
    }

    public long date2Timestamp() {
        return date.getTime(); // 1634101015089
    }

    public void basicInstantHandling() {
        System.out.println("instant: " + instant); // example: 2021-10-13T04:56:55.091882600Z
    }

    public long instant2Timestamp() {
        return instant.toEpochMilli(); // 1634101015091
    }

    public void changeTimeZoneEx() {
        // 歐洲倫敦時間
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Europe/London now: " + date);

        // GMT (which stands for Greenwich Mean Time) 格林威治時間
        TimeZone.setDefault( TimeZone.getTimeZone("GMT"));
        System.out.println("GMT now: " + date);

        // UTC (which stands for Coordinated Universal Time) 世界協調時間
        TimeZone.setDefault( TimeZone.getTimeZone("UTC"));
        System.out.println("UTC now: " + date);
    }

    // public Instant timestamp2Instant() {
        
    // }

    // public Date timestamp2Date() {
        
    // }

    // public boolean isSameTimestamp() {

    // }

    // public boolean isSameInstant() {

    // }

    // public boolean isSameUTC() {

    // }
}

class DateTimeTutorial {
    public static void showNow() {
        // * show now time.        
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

class DateHandler {
    private static Date date = new Date();

    public static void toResult() {
        System.out.println("[DateHandler] date: (" + DateHandler.date.getClass() + ") " + DateHandler.date);
    }

    public static void subtractionOneHour() {
        //! 加減乘除, 時間, day, hr, min, second.
        long time = date.getTime();
        System.out.println(time); // timestamp.

        // TimeUnit.DAYS
        // date.setTime(time - TimeUnit.HOURS.toMillis(1)); // 減
        // System.out.println("Change datetime: " + date); //
    }
}
