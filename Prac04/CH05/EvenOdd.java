package CH05;

/**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        System.out.print("Enter an Integer\t: >>> ");
        Scanner integerInput = new Scanner(System.in);
        String inputText = integerInput.nextLine();
        boolean inputValid = false;

        int inputInt = 0;
        while (inputValid == false)
            try
            {
                inputInt = Integer.parseInt(inputText);
                inputValid = true;
            }
            catch (NumberFormatException a)
            {
                System.out.print("Input is Not an INTEGER\nRe Enter\t\t\t: >>> ");
                inputText = integerInput.nextLine();
            }
        int modResult = inputInt % 2;
        if (modResult == 1)
            System.out.println("Integer is an ODD Number");
        else
            System.out.println("Integer is an EVEN Number");
    }
}
