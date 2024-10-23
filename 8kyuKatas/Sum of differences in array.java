/* Description
Your task is to sum the differences between consecutive pairs in the array in descending order.
Example
[2, 1, 10]  -->  9
In descending order: [10, 2, 1]
Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell, None in Rust).
*/

public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
        if (arr.length < 2) {
            return 0; 
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
            max = arr[i];
          }
          if (arr[i] < min) {
            min = arr[i];
          }
      }
        
    return max - min; 
  }
}
