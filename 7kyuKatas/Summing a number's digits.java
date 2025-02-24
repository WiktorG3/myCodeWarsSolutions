/*
Write a function which takes a number as input and returns the sum of the absolute value of each of the number's decimal digits.
For example: (Input --> Output)
10 --> 1
99 --> 18
-32 --> 5
Let's assume that all numbers in the input will be integer values.
*/

public class Kata{
  public static int sumDigits(int number){
    String numbers = number + "";
    int result = 0;
    for(char num : numbers.toCharArray()) {
      if (Character.isDigit(num)) {
        result += Integer.parseInt(String.valueOf(num));
      }
    }
    return result;
  }
}
