/* Description:
Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input. Return the result rounded to two decimals.
Graph
Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)
*/

public class Geometry{
  public static double squareArea(double A){
    double radius = 2 * A / Math.PI;
    return Math.round(Math.pow(radius, 2) * 100.0) / 100.0;
  }
}
