/* Description:
This is an easy twist to the example kata (provided by Codewars when learning how to create your own kata).
Add the value "codewars" to the array websites 1,000 times.
*/

import java.util.ArrayList;
import java.util.List;

public class KataExampleTwist
{
    public static String[] kataExampleTwist()
    {
       List<String> websites = new ArrayList<>();
       for (int i = 0; i < 1000; i++) {
            websites.add("codewars");
        }
        
        return websites.toArray(new String[0]);
    }
}
