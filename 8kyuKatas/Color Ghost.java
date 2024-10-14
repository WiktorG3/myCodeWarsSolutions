/*
Description:
Create a class Ghost
Ghost objects are instantiated without any arguments.
Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated
Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
*/

import java.util.Random;
public class Ghost {
  String[] colors = {"white", "yellow", "purple", "red"};
  public String getColor() {
    Random random = new Random();
    int index = random.nextInt(colors.length);
    return colors[index];
  }
}
