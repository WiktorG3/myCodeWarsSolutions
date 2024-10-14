/*
Description:
In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find the difference of the cuboids' volumes regardless of which is bigger.
For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20. Therefore, the function should return 8.
Your function will be tested with pre-made examples as well as random ones.
*/

public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int volumeFirst = 1;
    int volumeSecond= 1;
    
    for(int num : firstCuboid){
      volumeFirst = volumeFirst * num;
    }
    for(int num : secondCuboid){
      volumeSecond = volumeSecond * num;
    }
    return (volumeFirst >= volumeSecond) ? volumeFirst - volumeSecond : volumeSecond - volumeFirst;
  }
}
