/*
Each number should be formatted that it is rounded to two decimal places. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.
Example:    
5.5589 is rounded 5.56   
-3.3424 is rounded -3.34
*/

import java.text.DecimalFormat;

public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    DecimalFormat df = new DecimalFormat("#.00");
    String new_number = df.format(number);
    return Double.parseDouble(new_number);
  }
}
