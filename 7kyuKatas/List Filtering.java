/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
Example
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
*/

import java.util.List;
import java.util.stream.Collectors;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    // Return the List with the Strings filtered out
    List<Object> filtered = list.stream().filter(n -> n instanceof Integer && (Integer) n >= 0)
      .collect(Collectors.toList());
    return filtered;
  }
}
