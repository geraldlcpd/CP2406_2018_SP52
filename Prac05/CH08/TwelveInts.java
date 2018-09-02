package CH08;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class TwelveInts
{
    public static void main(String[] args)
    {
        int [] twelveNums = new int[4];
        for(int i = 0 ; i < 4 ; i ++)
        {
            System.out.print("Enter Number #" + i + ">> ");
            int numEntry = new Scanner(System.in).nextInt();
            twelveNums[i] = numEntry;

        }
        displayNums(twelveNums);
        dispNumsDesc(twelveNums);

    }
    public static void displayNums(int [] numArray)
    {
        System.out.println("ASCENDING");
        for (int i = 0; i < 4 ; i ++)
        {
            System.out.print(numArray[i] + ", ");
        }
        System.out.println();
    }

    public static void dispNumsDesc(int [] numArrayDesc)
    {
        System.out.println("\nDESCENDING");
        for (int x = 3; x > -1 ; x = x - 1)
        {
            System.out.print(numArrayDesc[x] + ", ");
        }
    }

}
