/*
Your task is to write function factorial.
https://en.wikipedia.org/wiki/Factorial
*/

import java.util.stream.LongStream;

public class Factorial {

    public static long factorial(int n) {
      return LongStream.rangeClosed(1, n)
                       .reduce(1, (x, y) -> x * y);
    }
}
