/*
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces.
Good luck!
If you like this Kata, please try:
Indexed capitalization
Even-odd disparity
*/

import java.util.ArrayList;

class Solution{
    public static String[] capitalize(String s){
      ArrayList<String> result = new ArrayList<String>();
        
      StringBuilder firstString = new StringBuilder(s.toLowerCase());
      StringBuilder secondString = new StringBuilder(s.toLowerCase());
      
      for(int i=0; i<firstString.length(); i++){
        if(i%2==0){
          firstString.setCharAt(i, Character.toUpperCase(firstString.charAt(i)));
        }
      }
      for(int i=0; i<secondString.length(); i++){
        if(i%2!=0){
          secondString.setCharAt(i, Character.toUpperCase(secondString.charAt(i)));
        }
      }
      
      result.add(firstString.toString());
      result.add(secondString.toString());
      
        return result.toArray(new String[0]);
    }
}
