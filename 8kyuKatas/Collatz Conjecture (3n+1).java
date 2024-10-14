public class CollatzConjecture {  
  public static int hotpo(int n) {
    int result = 0;
    while(n != 1){
      result += 1;
      if(n%2==0){
        n = n / 2;
      }else{
        n = 3*n+1;
      }
    }
    return result;
  } 
}
