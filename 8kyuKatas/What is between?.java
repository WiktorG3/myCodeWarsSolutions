/* Description:
Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
For example:
a = 1
b = 4
--> [1, 2, 3, 4]
*/

public class Kata {

  public static int[] between(int a, int b) {
    int[] arr = new int[b - a + 1];
    for (int i = a, j = 0; i <= b; i++, j++){
      arr[j] = i;
    }
    return arr;
  }
}
