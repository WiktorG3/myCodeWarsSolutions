/*
In this Kata, you will be given a string and your task will be to return a list of ints detailing the count of uppercase letters, lowercase, numbers and special characters (everything else), as follows.
The order is: uppercase letters, lowercase letters, numbers and special characters.
"*'&ABCDabcde12345" --> [ 4, 5, 5, 3 ]
More examples in the test cases.
Good luck!
*/

public class Kata {

    public static int[] Solve(String word) {
      //enjoy coding 
      int countUppercase = (int) word.chars().filter(Character::isUpperCase).count();
      int countLowercase = (int) word.chars().filter(Character::isLowerCase).count();
      int countNumbers   = (int) word.chars().filter(Character::isDigit).count();
      int countSpecial   = (int) word.chars().filter(c -> !Character.isLetterOrDigit(c)).count();
      
      return new int[]{countUppercase, countLowercase, countNumbers, countSpecial};
    }
}
