package CH08;

/**
 * Created by geraldoswald on 21/8/18.
 */
import java.util.Scanner;
public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        String enterKey = "";
        int [] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String [] dispProperties = {"all", "rev", "sum", "lim", "limHi"};
        int arrayLength = numArray.length;
        for (int i = 0 ; i < dispProperties.length ; i ++)
        {
            System.out.print("Press ENTER to Execute Next Function " + dispProperties[i] + " >> ");
            enterKey = new Scanner(System.in).nextLine();
            displayInteger(dispProperties[i], numArray);
        }

    }

    protected static void displayInteger(String numProp, int [] numberArray)
    {
        int arrayCount = numberArray.length;
        if (numProp.equals("all"))
        {
            System.out.println("Display All");
            for (int x = 0 ; x < arrayCount ; x ++)
                System.out.print(numberArray[x] + "   ");
            System.out.println();
        }
        else if (numProp.equals("rev"))
        {
            System.out.println("Display in Reverse Order");
            for (int x = 9 ; x > 0 ; x --)
                System.out.print(numberArray[x] + "   ");
            System.out.println();
        }

        else if (numProp.equals("sum"))
        {
            System.out.println("Summary of Integers");
            int sumInts = 0;
            for (int x = 0 ; x < arrayCount ; x ++)
            {
                sumInts = sumInts + numberArray[x];
            }
            System.out.println("Sum : " + sumInts);
        }

        else if (numProp.equals("lim"))
        {
            String txtPrint = "";
            System.out.print("Please Enter Limiting argument : >> ");
            int limArg = new Scanner(System.in).nextInt();
            for (int x = 0 ; x < arrayCount ; x ++)
            {
                if (numberArray[x] < limArg)
                    txtPrint = txtPrint + Integer.toString(numberArray[x]) + "   ";
            }
            System.out.println("Displaying Integer less than Limiting Argument " + limArg);
            System.out.println(txtPrint);
        }

        else if (numProp.equals("limHi"))
        {
            String txtPrint = "";
            System.out.print("Please Enter HI Limiting argument : >> ");
            int limArg = new Scanner(System.in).nextInt();
            for (int x = 0 ; x < arrayCount ; x ++)
            {
                if (numberArray[x] > limArg)
                    txtPrint = txtPrint + Integer.toString(numberArray[x]) + "   ";
            }
            System.out.println("Displaying Integer higher than Limiting Argument " + limArg);
            System.out.println(txtPrint);
        }

    }

}
