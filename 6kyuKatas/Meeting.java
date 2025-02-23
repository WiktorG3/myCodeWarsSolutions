/*
John has invited some friends. His list is:
s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Could you make a program that
makes this string uppercase
gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.
So the result of function meeting(s) will be:
"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
It can happen that in two distinct families with the same family name two people have the same first name too.
Notes
You can see another examples in the "Sample tests".
*/

import java.util.*;

class Meeting {
    
    public static String meeting(String s) {
      String[] people = s.split(";");
      String[][] names = new String[people.length][2];
      
      for(int i=0; i<people.length; i++){
        String[] parts = people[i].split(":");
        names[i][0] = parts[0].toUpperCase();
        names[i][1] = parts[1].toUpperCase();
      }
      
      Arrays.sort(names, (a, b) -> {
        int lastNameComparison = a[1].compareTo(b[1]);
          if (lastNameComparison != 0) {
              return lastNameComparison;
          } else {
              return a[0].compareTo(b[0]);
          }
      });
      
      StringBuilder result = new StringBuilder();
        for (String[] name : names) {
            result.append("(")
                  .append(name[1]).append(", ").append(name[0])
                  .append(")");
        }
        return result.toString();
    }
}
