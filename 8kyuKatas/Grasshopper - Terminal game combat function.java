/*
Create a combat function that takes the player's current health and the amount of damage received, and returns the player's new health. Health can't be less than 0.
*/

public class Game {
  
  public static int combat(int health, int damage) {
    if((health - damage) < 0){
      return 0;
    }
    return health - damage;
  }
}
