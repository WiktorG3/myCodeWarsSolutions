/*Description:
In this kata, we will make a function to test whether a period is late.
Our function will take three parameters:
last - The Date object with the date of the last period
today - The Date object with the date of the check
cycleLength - Integer representing the length of the cycle in days
Return true if the number of days passed from last to today is greater than cycleLength. Otherwise, return false.
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PeriodTime {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
        long daysBetween = ChronoUnit.DAYS.between(last, today);
        return daysBetween > cycleLength;
    }
}
