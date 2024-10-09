public class Kata{
  public static boolean validateHello(String greetings){
    String[] responses = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
    greetings = greetings.toLowerCase();
    
    for(String response : responses){
      if(greetings.contains(response)){
        return true;
      }
    }
    return false;
  }
}
