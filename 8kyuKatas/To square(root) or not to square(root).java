public class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
    int[] resultArray = new int[array.length];
    
    for(int i=0; i<array.length; i++){
      int num = array[i];
      double sqrt = Math.sqrt(num);
      
      if(sqrt == (int) sqrt){
        resultArray[i] =(int) sqrt;
        }else{
        resultArray[i] = num * num;
      }  
    }
    return resultArray;
  }
}
