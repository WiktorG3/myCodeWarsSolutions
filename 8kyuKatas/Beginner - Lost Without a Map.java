/* Description:
Given an array of integers, return a new array with each value doubled.
For example:
[1, 2, 3] --> [2, 4, 6]
*/

public class Maps {
  public static int[] map(int[] arr) {
    int i = 0;
    for (int num : arr){
      arr[i] = num*2;
      i += 1;
    }
    return arr;
  }
}
