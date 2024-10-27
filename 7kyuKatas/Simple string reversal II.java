/*
In this Kata, you will be given a string and two indexes (a and b). Your task is to reverse the portion of that string between those two indices inclusive.
str = "codewars", a = 1, b = 5 --> "cawedors"
str = "cODEWArs", a = 1, b = 5 --> "cAWEDOrs"
Input will be lowercase and uppercase letters only.
The first index a will always be smaller than the string length; the second index b can be greater than the string length. More examples in the test cases. Good luck!
Please also try:
Simple time difference
Simple remove duplicates
*/

import java.util.*;

class Solution{
    public static String solve(String s, int a, int b){
      StringBuilder result = new StringBuilder(s);
      int end = Math.min(b, s.length() - 1);
      String sub = s.substring(a, end + 1);
      
      String reversedSub = new StringBuilder(sub).reverse().toString();
      result.replace(a, end + 1, reversedSub);
      return result.toString();
    }
}
