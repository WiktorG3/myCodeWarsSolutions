/*
Write a function which calculates the average of the numbers in a given list.
Note: Empty arrays should return 0.
*/

public class Kata{
  public static double find_average(int[] array) {
      if(array == null || array.length == 0) {
        return 0;
      }
      int sum = 0;
      for(int num : array) {
        sum += num;
      }
      return (double) sum / array.length;
    }
}
