/*
Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.
Examples(Input1, Input2 --> Output):
"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
*/

public class Kata {
  public static String rps(String p1, String p2) {
    if(p1=="scissors"){
      if(p2=="paper")   return "Player 1 won!";
      if(p2=="rock")    return "Player 2 won!";
      if(p2=="scissors")return "Draw!";
    }else if(p1=="paper"){
      if(p2=="rock")    return "Player 1 won!";
      if(p2=="scissors")return "Player 2 won!";
      if(p2=="paper")   return "Draw!";
    }else if(p1=="rock"){
      if(p2=="scissors")return "Player 1 won!";
      if(p2=="paper")   return "Player 2 won!";
      if(p2=="rock")    return "Draw!";
    }
    return "";
  }
}
