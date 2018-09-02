package CH06;

/**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.Scanner;
public class EvenEntryLoop
{
    public static void main(String[] args)
    {
        final int SENTINEL = 999;
        System.out.print("Enter a Number: >>> ");
        int num_input = new Scanner(System.in).nextInt();
        while (num_input != SENTINEL)
        {
            if (num_input % 2 == 0)
                System.out.println("Good Job");
            else
                System.out.println("Please Try Again");
            System.out.print("Enter a Number: >>> ");
            num_input = new Scanner(System.in).nextInt();
        }

    }
}
