/*
Build a function that returns an array of integers from n to 1 where n>0.
Example : n=5 --> [5,4,3,2,1]
*/

public class Sequence{

  public static int[] reverse(int n){
    int[] list = new int[n];
    int j=0;
    for(int i=n; i>0; i--){
      list[j] = i;
      j++;
    }
    return list;
  }
}
