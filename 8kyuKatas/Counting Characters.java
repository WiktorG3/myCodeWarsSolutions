/*
Define a method named countCharOccurrences that accepts a string and a char as inputs and returns the number of times the char occurs in the string as an int.
*/

interface Count {
	static int countCharOccurrences(String s, char c) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++){
      if(s.charAt(i) == c){
        sum++;
      }
    }
    return sum;
  }
}
