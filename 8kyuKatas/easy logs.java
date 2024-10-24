/* Description:
Given a logarithm base X and two values A and B, return a sum of logratihms with the base X: 
logXA+logXBlog X A+log X B.
*/

public class EasyLogs {

  public static double logs(double x, double a, double b) {
    return Math.log(a*b)/Math.log(x);
  }

}
