/*
You will also be given the number of bags you have access to (bags), and the capactity of a bag (cap). If there are no bags then you can't pick anything up, so you can ignore cap.
You need to find out if you have enough capacity to collect all the cr@p and make your garden clean again.
If you do, return 'Clean', else return 'Cr@p'.
Watch out though - if your dog is out there ('D'), he gets very touchy about being watched. If he is there you need to return 'Dog!!'.
For example:
bags = 2
cap = 2
x (or garden) =
[[ _ , _ , _ , _ , _ , _ ],
 [ _ , _ , _ , _ , @ , _ ],
 [ @ , _ , _ , _ , _ , _ ]]
returns 'Clean'
*/

public class Kata {
    public static String crap(char[][] garden, int bags, int cap) {
      int poop=0;  
      for(int i=0; i<garden.length; i++){
          for(int j=0; j<garden[i].length; j++){
            if(garden[i][j]=='D'){
              return "Dog!!";
            }
            if(garden[i][j]=='@'){
              poop++;
            }
          }
        }
      return (poop <= bags*cap) ? "Clean" : "Cr@p";
    }
}
