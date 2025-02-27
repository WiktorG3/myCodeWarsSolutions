/*
You have an amount of money a0 > 0 and you deposit it with an interest rate of p percent divided by 360 per day on the 1st of January 2016. You want to have an amount a >= a0.
Task:
The function date_nb_days (or dateNbDays...) with parameters a0, a, p will return, as a string, the date on which you have just reached a.
Example:
date_nb_days(100, 101, 0.98) --> "2017-01-01" (366 days)
date_nb_days(100, 150, 2.00) --> "2035-12-26" (7299 days)
Notes:
The return format of the date is "YYYY-MM-DD"
The deposit is always on the "2016-01-01"
Don't forget to take the rate for a day to be p divided by 36000 since banks consider that there are 360 days in a year.
You have: a0 > 0, p% > 0, a >= a0
*/

import java.text.*;
import java.util.*;
import java.time.LocalDate;

public class DateDays {
    
    public static String dateNbDays(double a0, double a, double p) {
        double dailyRate = p / 36000.0;
        if (a0 >= a) {
          return LocalDate.of(2016, 1, 1).toString();
        }
      
        int days = (int) Math.ceil(Math.log(a / a0) / Math.log(1 + dailyRate));
        LocalDate depositDate = LocalDate.of(2016, 1, 1);
        LocalDate targetDate = depositDate.plusDays(days);
        return targetDate.toString();
    }
  
}
