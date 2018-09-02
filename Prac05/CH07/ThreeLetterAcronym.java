package CH07;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class ThreeLetterAcronym
{
    public static void main(String[] args)
    {
        System.out.print("Please Enter TLA: >> ");
        String TLAInput = new Scanner(System.in).nextLine();
        String TLAResult = Character.toString(TLAInput.charAt(0));
        int stringLength = TLAInput.length();
        for (int i = 0; i < stringLength ; i ++)
        {
            char TLAChar = TLAInput.charAt(i);
            if (Character.isWhitespace(TLAChar))
                TLAResult = TLAResult + Character.toUpperCase(TLAInput.charAt(i + 1));
        }
        System.out.print("\tAcronym: " + TLAResult);
    }

}
