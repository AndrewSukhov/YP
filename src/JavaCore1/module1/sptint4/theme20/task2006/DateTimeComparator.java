package JavaCore1.module1.sptint4.theme20.task2006;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        int result = 0;
        if (dt1.year != dt2.year) {
            result = Integer.compare(dt1.year, dt2.year);
        } else if (dt1.month != dt2.month) {
            result = Integer.compare(dt1.month, dt2.month);
        } else if (dt1.day != dt2.day) {
            result = Integer.compare(dt1.day, dt2.day);
        } else if (dt1.hours != dt2.hours) {
            result = Integer.compare(dt1.hours, dt2.hours);
        } else if (dt1.minutes != dt2.minutes) {
            result = Integer.compare(dt1.minutes, dt2.minutes);
        } else if (dt1.seconds != dt2.seconds) {
            result = Integer.compare(dt1.seconds, dt2.seconds);
        }
        return result;
    }
}
