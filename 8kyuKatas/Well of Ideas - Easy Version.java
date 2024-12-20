/* Description:
For every good kata idea there seem to be quite a few bad ones!
In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.
*/

public class Kata {

  public static String well(String[] x) {
    int sumOfGood = 0;
    for(int i=0; i<x.length; i++){
      if(x[i].equals("good")){
        sumOfGood += 1;
      }
    }
    if(sumOfGood > 2){
      return "I smell a series!";
    }else if(sumOfGood == 1 || sumOfGood == 2){
      return "Publish!";
    }else{
      return "Fail!";
    }
  }

}
