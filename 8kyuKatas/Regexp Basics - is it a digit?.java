/* Desc:
Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if given object is a digit (0-9), false otherwise.
*/

public class StringUtils {
  
  public static boolean isDigit(String s) {
    return s.length() == 1 && Character.isDigit(s.charAt(0));
  }
}
