/*
Given an array of integers your solution should find the smallest integer.
For example:
Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
*/

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) 
    {
      int min = args[0];
      for (int num : args)
        if (num < min)
          min = num;
      return min;

    }
}
