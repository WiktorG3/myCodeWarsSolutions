/*
Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran, Chars in Haskell), check if the array contains three and two of the same values.
Examples
["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
["a", "a", "a", "a", "a"] ==> false // 5x "a"
*/

public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
      int countOfA = 0, countOfB = 0, countOfC = 0;
      
      for(char c : chars){
        if(c=='a') countOfA++;
        if(c=='b') countOfB++;
        if(c=='c') countOfC++;
      }
      return (countOfA == 3 && countOfB == 2) ||
             (countOfA == 3 && countOfC == 2) ||
             (countOfB == 3 && countOfA == 2) ||
             (countOfB == 3 && countOfC == 2) ||
             (countOfC == 3 && countOfA == 2) ||
             (countOfC == 3 && countOfB == 2);
    }
}
