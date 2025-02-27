/*
Task:
Build a string representing a capital letter C of a given size out of 'C' characters.
Examples:
generateC(1) 
should return this string:
CCCCC
C
C
C
CCCCC
generateC(2)
should be
CCCCCCCCCC
CCCCCCCCCC
CC
CC
CC
CC
CC
CC
CCCCCCCCCC
CCCCCCCCCC
and so on. Given size, the string should have 5*size lines, following the format above. size is a positive integer ≤ 2000.
Note that extra spaces after the C's in any line are incorrect. And the last line should not terminate with "\n".
This kata was inspired by A for Apple, but takes a different approach to generating letters.
*/

public class GenerateC {
    public static String generateC(int size) {
      StringBuilder c = new StringBuilder();
      int totalLines = 5 * size;
      int currentLine = 0;
      
      for(int i=0; i<size; i++) {
        c.append("CCCCC".repeat(size));
        currentLine++;
        if (currentLine < totalLines) {
            c.append("\n");
        }
      }
      
      for(int i=0; i<3*size; i++) {
        c.append("C".repeat(size));
        currentLine++;
        if (currentLine < totalLines) {
            c.append("\n");
        }
      }
      
      for(int i=0; i<size; i++) {
        c.append("CCCCC".repeat(size));
        currentLine++;
        if (currentLine < totalLines) {
            c.append("\n");
        }
      }
      
      return c.toString();
    }
}
