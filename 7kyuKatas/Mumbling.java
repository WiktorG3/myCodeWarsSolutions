/*
This time no story, no theory. The examples below show you how to write function accum:
Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Accumul {
    
    public static String accum(String s) {
     return IntStream.range(0, s.length()).mapToObj(i -> {
        char c = s.charAt(i);
        String repeated = String.valueOf(c).toLowerCase().repeat(i + 1);
        return Character.toUpperCase(repeated.charAt(0)) + repeated.substring(1);
       }).collect(Collectors.joining("-"));
    }
}
