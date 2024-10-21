/* Description:
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!
The function takes a name as its only argument, and returns one of the following strings:
name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings.
*/

public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    if(name.charAt(0) == 'r' || name.charAt(0) == 'R'){
      return String.format("%s plays banjo", name);
    }
    return String.format("%s does not play banjo", name);
  }
}
