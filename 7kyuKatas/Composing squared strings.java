/*
A squared string is a string of n lines, each substring being n characters long. We are given two n-squared strings.
For example:
s1 = "abcd\nefgh\nijkl\nmnop"
s2 = "qrst\nuvwx\nyz12\n3456"
Let us build a new string strng of size (n + 1) x n in the following way:
The first line of strng has the first char of the first line of s1 plus the chars of the last line of s2.
The second line of strng has the first two chars of the second line of s1 plus the chars of the penultimate line of s2 except the last char
and so on until the nth line of strng has the n chars of the nth line of s1 plus the first char of the first line of s2.
So we have:
strng --> "a3456\nefyz1\nijkuv\nmnopq"
or printed:
abcd    qrst  -->  a3456
efgh    uvwx       efyz1
ijkl    yz12       ijkuv
mnop    3456       mnopq
*/

class Composing {
    
    public static String compose(String s1, String s2) {
        String[] lines1 = s1.split("\n");
        String[] lines2 = s2.split("\n");
        int n = lines1.length;
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            String part1 = lines1[i].substring(0, i + 1);
            String lineFromS2 = lines2[n - 1 - i];
            int lenToTake = lineFromS2.length() - i;
            String part2 = lineFromS2.substring(0, lenToTake);
          
            result.append(part1).append(part2);
            if (i != n - 1) {
                result.append("\n");
            }
        }
        
        return result.toString();
    }
}
