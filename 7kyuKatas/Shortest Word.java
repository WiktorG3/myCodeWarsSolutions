/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
*/

import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
      return Arrays.stream(s.split(" ")).mapToInt(String::length).min().orElse(0);

    }
}
