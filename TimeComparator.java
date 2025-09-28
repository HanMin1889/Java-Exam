import java.util.Comparator;

public class TimeComparator implements Comparator<Time2> {
    public int compare(Time2 time1, Time2 time2) {
        int hourCompare = time1.getHour() - time2.getHour();

        if (hourCompare != 0) {
            return hourCompare;
        }
