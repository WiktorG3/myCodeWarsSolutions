/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
Examples input/output:
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/

public class XO {
  
  public static boolean getXO (String str) {
    int countOfX = 0;
    int countOfO = 0;
    
    for(char c : str.toCharArray()){
      if(c == 'x' || c == 'X'){
        countOfX++;
      }
      if(c == 'o' || c == 'O'){
        countOfO++;
      }
    }
    return countOfX==countOfO;
    
  }
}
