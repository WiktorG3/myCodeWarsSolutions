/* Description:
Complete the solution so that it reverses the string passed into it.
'world'  =>  'dlrow'
'word'   =>  'drow'
*/

public class Kata {

  public static String solution(String str) {
    StringBuilder getString = new StringBuilder(str);
    StringBuilder reverseString = getString.reverse();
    return reverseString.toString();
  }

}
