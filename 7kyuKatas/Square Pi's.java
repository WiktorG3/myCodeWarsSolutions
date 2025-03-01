/*
Everybody loves pi, but what if pi were a square? Given a number of digits digits, find the smallest integer whose square is greater or equal to the sum of the squares of the first digits digits of pi, including the 3 before the decimal point.
Note: Test cases will not extend beyond 100 digits; the first 100 digits of pi are pasted here for your convenience:
31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679
Examples
digits   = 1   #  [3]
expected = 3   #  sqrt(3^2) = 3
digits   = 3   #  [3, 1, 4]
expected = 6   #  sqrt(3^2 + 1^2 + 4^2) = 5.099 --> 6
*/

public class SquarePi {
  int digits;

    public SquarePi(int digits) {
            this.digits = digits;
    }

    public int calculate() {
      if (digits == 0) {
        return 0;
      }
      
      String piNums = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
      int[] pi = new int[piNums.length()];
      
      for(int i = 0; i < piNums.length(); i++) {
        pi[i] = piNums.charAt(i) - '0';
      }
      
      double sum=0;
      for(int i=0; i<digits; i++){
        sum += pi[i] * pi[i];
      }
      
      int result = 1;
      while (result * result < sum) {
        result++;
      }
      
      return result;
    }
}
