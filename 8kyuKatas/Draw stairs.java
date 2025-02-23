/*
Given a number n, draw stairs using the letter "I", n tall and n wide, with the tallest in the top left.
For example n = 3 result in:
"I\n I\n  I"
or printed:
I
 I
  I
Another example, a 7-step stairs should be drawn like this:
I
 I
  I
   I
    I
     I
      I
*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stairs{
  public static String draw(int n){
    // do something
    return IntStream.range(0, n)
      .mapToObj(i -> " ". repeat(i) + "I")
      .collect(Collectors.joining("\n"));
  }
}
