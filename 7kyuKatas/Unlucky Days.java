/*
Friday 13th or Black Friday is considered as unlucky day. Calculate how many unlucky days are in the given year.
Find the number of Friday 13th in the given year.
Input: Year in Gregorian calendar as integer.
Output: Number of Black Fridays in the year as an integer.
Examples:
unluckyDays(2015) == 3
unluckyDays(1986) == 1
*/

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Kata {
  public static int unluckyDays(int year) {
    int unluckyDaysCount = 0;
    
    for(int month = 1; month <= 12; month++){
      LocalDate date = LocalDate.of(year, month, 13);
      
      if(date.getDayOfWeek() == DayOfWeek.FRIDAY){
        unluckyDaysCount++;
      }
    }
    return unluckyDaysCount;
  }
}
