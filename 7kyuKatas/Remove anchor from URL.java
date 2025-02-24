/*
Complete the function/method so that it returns the url with anything after the anchor (#) removed.
Examples
"www.codewars.com#about" --> "www.codewars.com"
"www.codewars.com?page=1" -->"www.codewars.com?page=1"
*/

public class Kata {
    public static String removeUrlAnchor(String url) {
        int position = url.indexOf("#");

        if (position!=-1)
            url = url.substring(0, position);

        return url;
    }
}
