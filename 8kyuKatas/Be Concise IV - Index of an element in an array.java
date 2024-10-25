/*
Be Concise IV - Index of an element in an array
Task
Provided is a function Kata which accepts two parameters in the following order: array, element and returns the index of the element if found and "Not found" otherwise. 
Your task is to shorten the code as much as possible in order to meet the strict character count requirements of the Kata. (no more than 161) You may assume that all array elements are unique.
*/

public class Solution{public static String kata(String[] a,String s){for(int i=0;i<a.length;i++)if(a[i].equals(s))return""+i;return"Not found";}}
