/*
Given a string and an array of integers representing indices, capitalize all letters at the given indices.
For example:
capitalize("abcdef",[1,2,5]) = "aBCdeF"
capitalize("abcdef",[1,2,5,100]) = "aBCdeF". There is no index 100.
The input will be a lowercase string with no spaces and an array of digits.
Good luck!
Be sure to also try:
Alternate capitalization
String array revisal
*/

package kata;

public class Solution{
    public static String capitalize(String s, int[] ind){
        StringBuilder result = new StringBuilder(s);
      
      for(int index : ind){
        if(index >= 0 && index < result.length()){
          result.setCharAt(index, Character.toUpperCase(result.charAt(index)));
        }
      }
      return result.toString();
    }
}
