/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
Examples
highAndLow("1 2 3 4 5") // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
*/

import java.util.Arrays;

public class Kata {
  public static String highAndLow(String numbers) {
    
    
    int[] intArray = Arrays.stream(numbers.split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
    
    int max = intArray[0];
    int min = intArray[0];
    
    for(int number : intArray){
      if(number > max){
        max = number;
      }
      if(number < min){
        min = number;
      }
    }
    return max + " " + min;
    
  }
}
