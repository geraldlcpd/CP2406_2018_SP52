package CH07;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class CountMovieSpace2
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Quote\t: >>> ");
        String movieQuote = new Scanner(System.in).nextLine();
        int spaceCount = 0;
        int stringLength = movieQuote.length();
        for (int i = 0 ; i < stringLength ; i = i + 1)
        {
            char ch = Character.toLowerCase(movieQuote.charAt(i));
            if (Character.isWhitespace(ch))
                spaceCount ++ ;
        }
        System.out.println("The Quote is " + " '" + movieQuote + "'");
        System.out.print("The Number of Spaces is\t: " + spaceCount);
    }
}
