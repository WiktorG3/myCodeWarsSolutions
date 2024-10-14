public class Kata {
  public static String findNeedle(Object[] haystack) {
    // Your code here
    int position = 0;
    for(Object find : haystack){
      if ("needle".equals(find)){
        break;
      }
      position++;
    }
    
    return "found the needle at position " + position;
  }
}
