/*
HELP! Jason can't find his textbook! It is two days before the test date, and Jason's textbooks are all out of order! Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.
The sorting should NOT be case sensitive
*/

import java.util.*;

class sorter {
  public static List<String> sort(List<String> textbooks) {
    //Cramming right before a test can't be that bad?
           Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);

       return textbooks;
  }
}
