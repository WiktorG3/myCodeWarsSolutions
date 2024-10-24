/* Description:
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
*/

public class Kata {
  public static int[] digitize(long n) {
    
    String numberStr = Long.toString(n);
        
        int[] result = new int[numberStr.length()];
        
        for (int i = 0; i < numberStr.length(); i++) {
            result[i] = Character.getNumericValue(numberStr.charAt(numberStr.length() - 1 - i));
        }
        
        return result;
}
  
}
