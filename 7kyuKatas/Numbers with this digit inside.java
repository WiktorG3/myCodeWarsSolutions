/*
You have to search all numbers from inclusive 1 to inclusive a given number x, that have the given digit d in it.
The value of d will always be 0 - 9.
The value of x will always be greater than 0.
You have to return as an array
the count of these numbers,
their sum
and their product.
For example:
x = 11
d = 1
->
Numbers: 1, 10, 11
Return: [3, 22, 110]
If there are no numbers, which include the digit, return [0,0,0].
Have fun coding it and please don't forget to vote and rank this kata! :-)
I have created other katas. Have a look if you like coding and challenges.
*/

public class Kata
{
  public static long[] NumbersWithDigitInside(long x, long d)
  {
    int count=0;
    long sum=0;
    long product=1;
    
    for(int i=1; i<=x; i++){
      String s = Long.toString(i);
      
      if(s.indexOf(Long.toString(d)) != -1) {
        count++;
        sum += i;
        product *= i;
      }
    }
    if(count == 0) {
      product = 0;
    }
    return new long[]{count, sum, product};
  }
}
