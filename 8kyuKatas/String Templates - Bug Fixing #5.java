public class Kata 
{
    public static String buildString(String... args)
    {
      StringBuilder result = new StringBuilder();
      
      for(int i=0; i<args.length; i++){
        result.append(args[i]);
        if(i<args.length-1){
         result.append(", ");
        }
      }
      
      return "I like " + result.toString() + "!";
    }
}
