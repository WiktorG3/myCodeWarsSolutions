/*
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
Write a function which takes a list of strings and returns each line prepended by the correct number.
The numbering starts at 1. The format is n: string. Notice the colon and space in between.
Examples: (Input --> Output)
[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
*/

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> newList = new ArrayList<String>();
        for(int i = 0; i < lines.size(); i++){
          newList.add(i+1 + ": " + lines.get(i));
        }
      return newList;
    }
}
