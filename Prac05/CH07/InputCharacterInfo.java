package CH07;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class InputCharacterInfo
{
    public static void main(String[] args)
    {
        System.out.print("Please Input CHARACTER\t: >>> ");
        String charInput = new Scanner(System.in).nextLine();
        while (charInput.length() > 1)
        {
            System.out.println("Character count is more than 1. Required 1 only");
            System.out.print("Please Input CHARACTER\t: >>>");
            charInput = new Scanner(System.in).nextLine();
        }
        char aChar = charInput.charAt(0);
        System.out.println("The Character is " + aChar);
        if(Character.isUpperCase(aChar))
            System.out.println("Character " + aChar + " is UPPERCASE");
        else
            System.out.println("Character " + aChar + " is NOT UPPERCASE");

        if (Character.isLowerCase(aChar))
            System.out.println("Character " + aChar + " is LOWERCASE");
        else
            System.out.println("Character " + aChar + " is NOT LOWERCASE");

        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is\t= " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is\t= " + aChar);

        if (Character.isLetterOrDigit(aChar))
            System.out.println("Character " + aChar + " is a LETTER or DIGIT");
        else
            System.out.println("Character " + aChar + " is Neither a LETTER or DIGIT");

        if (Character.isWhitespace(aChar))
            System.out.println("Character " + aChar + " is a WHITESPACE");
        else
            System.out.println("Character " + aChar + " is NOT a WHITESPACE");

    }


}
