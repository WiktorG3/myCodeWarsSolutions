/*
Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
Examples (Input -> Output):
* "String"      -> "SSttrriinngg"
* "Hello World" -> "HHeelllloo  WWoorrlldd"
* "1234!_ "     -> "11223344!!__  "
Good Luck!
*/

public class Solution{
  public static String doubleChar(String s){
    String n="";
   for(int i =0 ;i<s.length();i++){
     n+= s.charAt(i);
     n+= s.charAt(i);
}
    return n;
  }
}
