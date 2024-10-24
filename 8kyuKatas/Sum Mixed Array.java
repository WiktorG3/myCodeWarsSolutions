/* Description:
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
Return your answer as a number.
*/

import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
    int sum = 0;
    for(int i=0; i<mixed.size(); i++){
      Object element = mixed.get(i);
      if(element instanceof Integer){
        sum += (Integer) element;
      }else if(element instanceof String){
        sum += Integer.valueOf((String) element);
      }
    }
		return sum;
	}
}
