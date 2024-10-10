public class Kata {
    public static long sumMul(int n, int m) {
      if (n <= 0 || m <= 0) {
        throw new IllegalArgumentException("n and m must be positive integers");
      }  
      long sum = 0;
      for(int i=n; i < m; i += n){
        sum += i;
      }
      return sum;
    }
}
