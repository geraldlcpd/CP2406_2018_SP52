package CH08;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        final String EXIT = "99999";
        Scanner keyInput = new Scanner(System.in);
        double [] numArray = new double[20];
        for (int i = 0; i < 20; i ++ )
        {
            System.out.print("Enter Number " + i + " or " + EXIT + " to Quit >>> ");
           // boolean inputCheck = false;
            double newEntry = new Scanner(System.in).nextDouble();
            if (newEntry != 99999)
                numArray[i] = newEntry;
            else
                break;
            double average = displayAttributes(numArray);
            double avg1 = average - newEntry;
            double avg2 = average + newEntry;
            double finalAvg;
            if (avg1 > 0)
                finalAvg = avg1;
            else
                finalAvg = avg2;
            System.out.println("Different from Average: " + finalAvg);
        }
    }

    private static double displayAttributes(double [] numArray)
    {
        double sumValues = 0;
        for (int i = 0 ; i < 20 ; i ++)
            sumValues = sumValues + numArray[i];

        double avgValue = sumValues / 20;
        return avgValue;

    }
}
