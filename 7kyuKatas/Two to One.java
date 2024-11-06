/*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string (alphabetical ascending), the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"
a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
*/

import java.util.stream.Collectors;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
      String s3 = s1 + s2;
      
      return s3.chars().distinct().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }
}
