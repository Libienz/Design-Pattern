package pb1;

import java.time.LocalTime;

public class DateTime {

    public Object getTime() {
        LocalTime time = LocalTime.now();
        return time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
    }
}
