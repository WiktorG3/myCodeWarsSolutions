/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.
Complete the method which accepts such an array, and returns that single different number.
The input array will always be valid! (odd-length >= 3)
Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
  static int stray(int[] numbers) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int num : numbers) {
        counts.put(num, counts.getOrDefault(num, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
        if (entry.getValue() == 1) {
            return entry.getKey();
        }
    }
    return -1;
  }
}
