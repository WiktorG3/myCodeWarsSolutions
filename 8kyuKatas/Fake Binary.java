/* Description:
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
Note: input will never be an empty string
*/

public class FakeBinary {
    public static String fakeBin(String numberString) {
      String binary = "";
        for (int i = 0 ; i != numberString.length() ; i++) {
          char c = numberString.charAt(i);
          if(Character.getNumericValue(c) < 5){
            binary += "0";
          }else{
            binary += "1";
          }
        }
      return binary;
    }
}
