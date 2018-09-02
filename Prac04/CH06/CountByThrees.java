package CH06;

/**
 * Created by geraldoswald on 6/8/18.
 */

public class CountByThrees
{
    public static void main(String[] args)
    {
        int COUNTER = 3;
        final int LIMITER = 30;
        int counter_index = 1;
        int limiter_index = 1;
        int count_num = counter_index * COUNTER;
        int count_idx;
        while (count_num < 303)
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
