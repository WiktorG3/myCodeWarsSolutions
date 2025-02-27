/*
Create a function that accepts an array of names, and returns an array of each name with its first letter capitalized and the remainder in lowercase.
Examples
['jo', 'nelson', 'jurie'] -->  ['Jo', 'Nelson', 'Jurie']
['KARLY', 'DANIEL', 'KELSEY'] --> ['Karly', 'Daniel', 'Kelsey']
*/

import java.util.*;

public class Kata {
  public static String[] capMe(String[] strings) {
    List<String> names = new ArrayList<>();
    
    for(String name : strings){
      if (name.isEmpty()) {
        names.add(name);
      } else {
        names.add(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
      }
    }
     return names.toArray(new String[0]);
  }
}
