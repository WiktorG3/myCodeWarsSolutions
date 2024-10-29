/*
Implement function which will return sum of roots of a quadratic equation rounded to 2 decimal places, if there are any possible roots, else return None/null/nil/nothing. 
If you use discriminant,when discriminant = 0, x1 = x2 = root => return sum of both roots. There will always be valid arguments.
Quadratic equation - https://en.wikipedia.org/wiki/Quadratic_equation
*/

import java.util.OptionalDouble; 


public class Solution{
  public static OptionalDouble roots(double a, double  b, double c){
    double discriminant = Math.pow(b, 2) - 4 * a * c;
    
    if (discriminant < 0)
      return OptionalDouble.empty();
    
    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
    
    double sumOfRoots = x1 + x2;
    
    return OptionalDouble.of(Math.round(sumOfRoots * 100.0) / 100.0);
  }
}
