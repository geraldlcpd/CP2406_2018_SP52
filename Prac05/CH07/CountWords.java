package CH07; /**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class CountWords
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Phrase: >>> ");
        String wordInput = new Scanner(System.in).nextLine();
        int wordCount = 1;
        int charCount = wordInput.length();
        for (int i = 0 ; i < charCount ; i ++)
        {
            char wordChar = wordInput.charAt(i);
            if (Character.isWhitespace(wordChar))
                wordCount ++;

        }
        System.out.println("Phrase has " + wordCount + " words");

    }

}
