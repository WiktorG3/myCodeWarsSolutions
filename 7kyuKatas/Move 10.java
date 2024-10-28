/*
Move every letter in the provided string forward 10 letters through the alphabet.
If it goes past 'z', start again at 'a'.
Input will be a string with length > 0.
*/

public class MoveTen {
  public static String moveTen(String s) {
    StringBuilder result = new StringBuilder();
    
    for(char c : s.toCharArray()){
      if(c >= 'a' && c <= 'z'){
        result.append((char) ((c-'a'+10) % 26 + 'a'));
      }
      else if (c >= 'A' && c <= 'Z') {
          result.append((char) ((c - 'A' + 10) % 26 + 'A'));
      }
      else {
          result.append(c);
      }
    }
    return result.toString();
  }
}
