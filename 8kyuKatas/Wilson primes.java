/*
Wilson primes satisfy the following condition.
Your task is to create a function that returns true if the given number is a Wilson prime and false otherwise.
*/

public class WilsonPrime {
	public static boolean amIWilson(long n) {
    return n==5 || n==13 || n==563;
  }
}
