/* Description:
Sentence Smash
Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. 
You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!
Example
['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
*/

public class SmashWords {

	public static String smash(String... words) {
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                result += words[i] + " ";
            } else {
                result += words[i];
            }
        }

        return result;
    }
}
