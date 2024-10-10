public class Kata{
  public static String datingRange(int age) {
    int minAge;
    int maxAge;
    
    if(age <= 14){
      minAge = (int) (age - 0.10 * age); 
      maxAge = (int) (age + 0.10 * age); 
    }else{
      minAge = (int) (age/2+7);
      maxAge = (int) ((age-7) * 2);
    }
    return minAge + "-" + maxAge;
  }
}
