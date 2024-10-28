/*
Implement a function that takes two numbers m and n and returns an array of the first m multiples of the real number n. Assume that m is a positive integer.
Ex.
(3, 5.0) --> [5.0, 10.0, 15.0]
*/

import java.util.stream.IntStream;

public class Kata {
  public static int[] multiples(int m, int n) {
    return IntStream.iterate(n, num -> num + n)
                        .limit(m)
                        .toArray();
  }
}
