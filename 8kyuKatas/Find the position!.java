/*
When provided with a letter, return its position in the alphabet.
Input :: "a"
Output :: "Position of alphabet: 1"
Note: Only lowercased English letters are tested
*/

public class Kata
{
  public static String position(char alphabet)
  {
    int position = alphabet - 'a' + 1;
    return "Position of alphabet: " + position;
  }
}
