package JavaCore1.module1.sptint4.theme20.task2006;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        return Integer.compare(dt1.year, dt2.year);
    }
}
