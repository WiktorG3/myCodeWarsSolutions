/*
An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
Note: anagrams are case insensitive
Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
Examples
"foefet" is an anagram of "toffee"
"Buckethead" is an anagram of "DeathCubeK"
*/

import java.util.*;

public class Kata {
  public static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    char[] a1 = a.toCharArray();
    char[] a2 = b.toCharArray();
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
  }
}
