package example.TmpExample;

import java.sql.Timestamp;

public class TimestampExample {
    public static void main(String[] args) {
        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        System.out.println("datetime: " + datetime + "; timestamp: " + timestamp);
    }
}
