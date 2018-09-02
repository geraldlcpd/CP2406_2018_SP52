package CH05;

/**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.Scanner;
public class AscendingAndDescending
{
    public static void main(String[] args)
    {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        String input1S, input2S, input3S;
        input1S = input2S = input3S = "";

        System.out.print("Enter Number 1\t: >>> ");
        input1S = num1.nextLine();
        int input1 = inputValidation(input1S);

        System.out.print("Enter Number 2\t: >>> ");
        input2S = num2.nextLine();
        int input2 = inputValidation(input2S);

        System.out.print("Enter Number 3\t: >>> ");
        input3S = num3.nextLine();
        int input3 = inputValidation(input3S);

        int val1, val2, val3;
        val1 = val2 = val3 = 0;

        if (input1 < input2 && input1 < input3)
            val1 = input1;
        if (input2 < input1 && input2 < input3)
            val1 = input2;
        if (input3 < input1 && input3 < input2)
            val1 = input3;

        if (input1 > input2 && input1 > input3)
            val3 = input1;
        if (input2 > input1 && input2 > input3)
            val3 = input2;
        if (input3 > input1 && input3 > input2)
            val3 = input3;

        if (input1 < val3 && input1 > val1)
            val2 = input1;
        if (input2 < val3 && input2 > val1)
            val2 = input2;
        if (input3 < val3 && input3 > val1)
            val2 = input3;

        System.out.println("\nAscending\n" + val1 + " >>> " + val2 + " >>> " + val3);
        System.out.println("Descending\n" + val3 + " >>> " + val2 + " >>> " + val1);

    }

    public static int inputValidation(String input)
    {
        String inputString = input;
        int inputInt = 0;
        boolean inputValid = false;
        while (inputValid == false)
        {
            try
            {
                inputInt = Integer.parseInt(inputString);
                inputValid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.print("Not a Number. Reenter\t: >>> ");
                inputString = new Scanner(System.in).nextLine();
            }
        }
        return inputInt;
    }
}
