/*
Write a function that can return the smallest value of an array or the index of that value. The function's 2nd parameter will tell whether it should return the value or the index.
Assume the first parameter will always be an array filled with at least 1 number and no duplicates. Assume the second parameter will be a string holding one of two values: 'value' and 'index'.
Some examples:
([1,2,3,4,5], "value") should return 1
([1,2,3,4,5], "index") should return 0
*/

public class Codewars {
    public static int findSmallest(int[] numbers, String mode) {
      int min = numbers[0];
      int index = 0;
      
      for(int i=1; i<numbers.length; i++){
        if(numbers[i] < min){
          min = numbers[i];
          index = i;
        }
      }
      
      return mode=="value" ? min : index;
    }
}
