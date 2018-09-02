package CH07;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        System.out.println("Password must contain 2 uppercase, 2 lowercase, 2 digits");
        System.out.print("Please Enter a Password\t: >>> ");
        String password = new Scanner(System.in).nextLine();
        int lowCount = 0;
        int uppCount = 0;
        int numCount = 0;
        int pswLength = password.length();
        boolean pswReqMeet = PasswordCheck(password, pswLength);
        while (pswReqMeet == false)
        {
            System.out.println("Password Complexity Requirements not met. Please Try Again");
            System.out.print("Enter a Password\t: >>> ");
            password = new Scanner(System.in).nextLine();
            pswLength = password.length();
            pswReqMeet = PasswordCheck(password, pswLength);
        }
        System.out.println("Your password is accepted");
    }

    public static boolean PasswordCheck(String pswInput,int pswLength)
    {
        // int passwordLength = pswLength;
        int lowCount = 0;
        int uppCount = 0;
        int numCount = 0;
        int spcCount = 0;
        int symCount = 0;
        for (int i = 0; i < pswLength ; i ++ )
        {
            char pswChar = pswInput.charAt(i);
            if (Character.isLowerCase(pswChar))
                lowCount ++;
            else if (Character.isUpperCase(pswChar))
                uppCount ++;
            else if (Character.isDigit(pswChar))
                numCount ++;
            else if (Character.isWhitespace(pswChar))
                spcCount ++;
            else
                symCount ++;
        }
        if (lowCount < 2 || uppCount < 2 || numCount < 2)
            return false;
        else
            return true;
    }
}
