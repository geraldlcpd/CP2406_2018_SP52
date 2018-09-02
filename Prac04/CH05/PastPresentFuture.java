package CH05;

/**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.Scanner;
public class PastPresentFuture
{

    public static void main(String[] args)
    {
        final int CURRENT_YEAR = 2018;
        final int CURRENT_MONTH = 8;
        final int CURRENT_DATE = 6;
        System.out.print("Enter Date: >> ");
        int inputDate = new Scanner(System.in).nextInt();
        System.out.print("Enter Month: >> ");
        int inputMonth = new Scanner(System.in).nextInt();
        System.out.print("Enter Year: >> ");
        int inputYear = new Scanner(System.in).nextInt();

        boolean valid_input = false;
        while (valid_input == false)
        {
            if (inputDate == CURRENT_DATE && inputMonth == CURRENT_MONTH && inputYear == CURRENT_YEAR)
            {
                valid_input = true;
            }
            else
            {
                if (inputYear != CURRENT_YEAR)
                    System.out.println("Not This Year\n");
                else if (inputYear == CURRENT_YEAR && inputMonth > CURRENT_MONTH)
                    System.out.println("This Year, but earlier month\n");
                else if (inputYear == CURRENT_YEAR && inputMonth < CURRENT_MONTH)
                    System.out.println("This Year, but later month\n");
                else if (inputMonth == CURRENT_MONTH && inputDate != CURRENT_DATE)
                    if (inputDate < CURRENT_DATE)
                        System.out.println("Later This Month\n");
                    else
                        System.out.println("Earlier this month\n");

                System.out.print("Enter Date: >> ");
                inputDate = new Scanner(System.in).nextInt();
                System.out.print("Enter Month: >> ");
                inputMonth = new Scanner(System.in).nextInt();
                System.out.print("Enter Year: >> ");
                inputYear = new Scanner(System.in).nextInt();
            }

        }
        System.out.println("Date is Correct");
    }
}

