/*
In this kata, your task is to implement an extended version of the famous rock-paper-scissors game. The rules are as follows:
Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
Task:
Given two values from the above game, return the Player result as "Player 1 Won!", "Player 2 Won!", or "Draw!".
Inputs
Values will be given as one of "rock", "paper", "scissors", "lizard", "spock".
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kata {
  
  public static String rpsls(String player1, String player2){
    Map<String, List<String>>  rules = new HashMap<>();
    rules.put("scissors", Arrays.asList("paper", "lizard"));
    rules.put("paper", Arrays.asList("rock", "spock"));
    rules.put("rock", Arrays.asList("lizard", "scissors"));
    rules.put("lizard", Arrays.asList("spock", "paper"));
    rules.put("spock", Arrays.asList("scissors", "rock"));
    
    if(player1.equals(player2)){
      return "Draw!";
    }
    
    if (rules.get(player1).contains(player2)) {
        return "Player 1 Won!";
    } else {
        return "Player 2 Won!";
    }
  }
}
