/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
[1, 2, 3, 4, 5] --> [-1, -2, -3, -4, -5]
[1, -2, 3, -4, 5] --> [-1, 2, -3, 4, -5]
[] --> []
*/

public class Kata {
  public static int[] invert(int[] array) {
    int[] newArr = new int[array.length];
    int i=0;
    for(int num : array){
      newArr[i] = num*-1;
      i++;
    }
    return newArr;
  }
}
