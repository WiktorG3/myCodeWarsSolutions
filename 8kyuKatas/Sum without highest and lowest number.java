/*
Task
Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
Mind the input validation.
Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6
Input validation
If an empty value ( null, None, Nothing, nil etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
*/

import java.util.Arrays;

public class Kata
{
  public static int sum(int[] numbers)
  {
    // If there are fewer than 3 elements, return 0
    if (numbers == null || numbers.length < 3) {
      return 0;
    }

    int min = Arrays.stream(numbers).min().getAsInt();
    int max = Arrays.stream(numbers).max().getAsInt();
    int sum = 0;
    boolean minExcluded = false;
    boolean maxExcluded = false;

    for (int number : numbers) {
      if (number == min && !minExcluded) {
        minExcluded = true; // Exclude only one instance of min
      } else if (number == max && !maxExcluded) {
        maxExcluded = true; // Exclude only one instance of max
      } else {
        sum += number;
      }
    }

    return sum;
  }
}
