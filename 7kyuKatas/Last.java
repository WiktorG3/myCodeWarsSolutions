/*
Find the last element of the given argument(s). If a single argument is passed and is a list/array or a string, return its last element. It is guaranteed that there will be at least one argument and that single-argument arrays/lists/strings will not be empty.
Examples
last(Arrays.asList(1, 2, 3, 4)); // =>  4
last("xyz");                     // => "z"
last(1, 2, 3, 4);                // =>  4
last(new int[]{1, 2, 3, 4});     // =>  4
(courtesy of haskell.org)
*/

import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);
    }
    public static char last(final String string) {
        return string.charAt(string.length() - 1);
    }
    public static <T> T last(final T... list) {
        return list[list.length - 1];
    }
}
