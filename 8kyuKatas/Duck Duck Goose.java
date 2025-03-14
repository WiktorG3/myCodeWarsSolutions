/*
The objective of Duck, duck, goose is to walk in a circle, tapping on each player's head until one is chosen.
Task:
Given an array of Player objects and a position (first position is 1), return the name of the chosen Player.
name is a property of Player objects, e.g Player.name
Example:
duck_duck_goose([a, b, c, d], 1) should return a.name
duck_duck_goose([a, b, c, d], 5) should return a.name
duck_duck_goose([a, b, c, d], 4) should return d.name
*/

public class Kata {
  public static String duckDuckGoose(Player[] players, int goose) {
    // Note: Player objects have a String field called 'name'.
      return players[(goose - 1) % players.length].name;
  }
}
