/*
You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. If they are, return true. Else, return false.
You can assume all values in the array are numbers.
*/

public class Kata
{
  public static boolean smallEnough(int[] a, int limit)
  {
    for(int value : a){
      if(value > limit){
        return false;
      }
    }
    return true;
  }
}
