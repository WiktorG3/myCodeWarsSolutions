/*
You are going to be given a non-empty string. Your job is to return the middle character(s) of the string.
If the string's length is odd, return the middle character.
If the string's length is even, return the middle 2 characters.
Examples:
"test" --> "es"
"testing" --> "t"
"middle" --> "dd"
"A" --> "A"
*/

class Kata {
  public static String getMiddle(String word) {
    return (word.length() % 2 == 0) ? word.substring(word.length()/2 - 1, word.length()/2+1) : word.substring(word.length()/2, word.length()/2+1);
  }
}
