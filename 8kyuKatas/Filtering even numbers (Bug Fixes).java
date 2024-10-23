/* Description:
Fix the bug in Filtering method
The method is supposed to remove even numbers from the list and return a list that contains the odd numbers.
However, there is a bug in the method that needs to be resolved.
*/

import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        listOfNumbers.removeIf(n -> n % 2 == 0); 
        return listOfNumbers;
    }
}
