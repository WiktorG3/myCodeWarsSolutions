/*Description:
Remove n exclamation marks in the sentence from left to right. n is positive integer.
Examples
remove("Hi!",1) === "Hi"
remove("Hi!",100) === "Hi"
remove("Hi!!!",1) === "Hi!!"
remove("Hi!!!",100) === "Hi"
remove("!Hi",1) === "Hi"
remove("!Hi!",1) === "Hi!"
remove("!Hi!",100) === "Hi"
remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"
*/

public class Kata {

  public static String remove(String s, int n){
    String result = s;
    String regex = "!";
    while(n > 0){
      result = result.replaceFirst(regex, "");
      n--;
    }
    return result; 
    
  }
  
}
