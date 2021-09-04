package LearnHutool.cron;

import java.util.TimeZone;

public class CronConfig {
    protected TimeZone timeZone = TimeZone.getDefault();
    protected boolean matchSecond;

    public CronConfig() {
        // constrcutor. 
    }

    public CronConfig setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public boolean isMatchSecond() {
        return this.matchSecond;
    }
}
