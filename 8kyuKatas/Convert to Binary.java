/*
Task Overview
Given a non-negative integer b, write a function which returns an integer d such that the binary representation of b is the same as the decimal representation of d.
Examples:
n = 1 should return 1
n = 5 should return 101
n = 11 should return 1011
*/

import java.io.*;
public class Kata {
  public static int toBinary(int n) {
    String binaryString = Integer.toBinaryString(n);
    int decimalValue = Integer.parseInt(binaryString);
    return decimalValue;
  }
}