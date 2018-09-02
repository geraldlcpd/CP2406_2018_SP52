package CH06;

/**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.Scanner;
public class CountNumbers
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Number to Print: >> ");
        int COUNTER = new Scanner(System.in).nextInt();
        final int LIMITER = 10 * COUNTER;
        int counter_index = 1;
        int limiter_index = 1;
        int count_num = counter_index * COUNTER;
        int count_idx;
        while (count_num < (101 * COUNTER))
        {
            count_num = counter_index * COUNTER;
            count_idx = limiter_index * LIMITER;
            if (count_num == (count_idx + COUNTER))
            {
                System.out.println();
                limiter_index = limiter_index + 1;
            }
            else
            {
                System.out.print(count_num + "  ");
                counter_index += 1;
            }
        }
    }
}
