/* Description:
Write a function that merges two sorted arrays into a single one. The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.
*/

import java.util.Arrays;
import java.util.LinkedHashSet;
public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
        // Create a new array that combines both input arrays
        int[] merged = new int[first.length + second.length];
        
        // Copy elements from both arrays into the merged array
        System.arraycopy(first, 0, merged, 0, first.length);
        System.arraycopy(second, 0, merged, first.length, second.length);
        
        // Use a LinkedHashSet to remove duplicates while maintaining order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : merged) {
            set.add(num);
        }
        
        // Convert the set back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }
        
        // Sort the result array
        Arrays.sort(result);
        
        return result; // Return the final sorted array without duplicates
  }
}
