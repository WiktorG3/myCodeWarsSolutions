/*
Hey Codewarrior!
In the previous kata, you have implemented a Cube class, but now we need your help again! I'm talking about constructors. We don't have one. Let's code one (or more) such that one can instantiate an object via it, handling either no arguments or a single integer.
Also we got a problem with negative values. Correct the code so negative values will be switched to positive ones!
The constructor taking no arguments should assign 0 to Cube's Side property.
*/

public class Cube {

  /*
  This cube needs help!
  Define a constructor (or more) such that one can instantiate an object 
  via it, handling either no arguments or a single integer
  */
  private int side;
  
  public Cube() {
    this.side = 0;
  }

  public Cube(int side){
    this.side = Math.abs(side);
  }

  public int getSide() {
    return side;
  }
  
  public void setSide(int side) {
    this.side =  Math.abs(side);
  }

}
