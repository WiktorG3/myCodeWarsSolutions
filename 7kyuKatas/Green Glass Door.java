/*
Step through my green glass door.
You can take the moon, but not the sun.
You can take your slippers, but not your sandals.
You can go through yelling, but not shouting.
You can't run through fast, but you can run with speed.
You can take a sheet, but not your blanket.
You can wear your glasses, but not your contacts.
Have you figured it out? Good! Then write a program that can figure it out as well.
*/

public class GreenGlassDoor {
  
  boolean stepThroughWith(String s) {
    //You can't bring your code, but you can bring this comment
    for(int i=1; i<s.length(); i++){
      if(s.charAt(i) == s.charAt(i - 1)){
        return true;
      }
    }
    return false;
  }
  
}
