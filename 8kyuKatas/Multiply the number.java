/* Description:
Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:
  3 -->    15  (  3 * 5¹)
 10 -->   250  ( 10 * 5²)
200 --> 25000  (200 * 5³)
  0 -->     0  (  0 * 5¹)
 -3 -->   -15  ( -3 * 5¹)
*/

public class Kata {
  public static int multiply(int number) {
    int absNumber = Math.abs(number);
    if (absNumber == 0) return 0;
    
    int digits = 0;
    while (absNumber > 0) {
      absNumber /= 10;  
      digits += 1;     
    }

    return number * (int) Math.pow(5, digits);
  }
}
