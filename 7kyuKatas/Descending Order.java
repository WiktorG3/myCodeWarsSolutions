/*
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
Examples:
Input: 42145 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321
*/

import java.util.stream.Collectors;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    return Integer.parseInt(Integer.toString(num).chars()
                            .mapToObj(c -> (char) c)
                            .sorted((a, b) -> b - a)
                            .map(String::valueOf)
                            .collect(Collectors.joining()));
  }
}
