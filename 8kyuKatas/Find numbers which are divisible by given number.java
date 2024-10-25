/*
Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.
Example(Input1, Input2 --> Output)
[1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]
*/

import java.util.ArrayList;
public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
    ArrayList<Integer> list = new ArrayList<>();
    for(int number : numbers){
      if(number % divider == 0){
        list.add(number);
      }
    }
    
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    
    return result;
  }
}
