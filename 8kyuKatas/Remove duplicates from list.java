/*
Define a function that removes duplicates from an array of non negative numbers and returns it as a result.
The order of the sequence has to stay the same.
Examples:
Input -> Output
[1, 1, 2] -> [1, 2]
[1, 2, 1, 1, 3, 2] -> [1, 2, 3]
*/

import java.util.*;
public class Solution {
  public static int[] distinct(int[] array){
      Set<Integer> uniqueElements = new LinkedHashSet<>();
    
    for(int num : array){
      uniqueElements.add(num);
    }
    int[] result = new int[uniqueElements.size()];
    int index = 0;
    for(int num : uniqueElements){
      result[index++] = num;
    }
    return result;
  }
}
