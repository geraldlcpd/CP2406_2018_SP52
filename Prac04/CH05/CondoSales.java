package CH05; /**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.Scanner;
public class CondoSales
{

    public static void main(String[] args)
    {
        System.out.print("Enter Your Choice\n\n1 - Park View\n2 - Gold Course View\n3 - Lake View\n: >>> ");
        Scanner inputValue = new Scanner(System.in);
        int inputCode = inputValue.nextInt();
        int price = 0;
        String condoType = "";

        if (inputCode == 1)
        {
            price = 150000;
            condoType = "Park View";
        }
        else if (inputCode == 2)
        {
            price = 170000;
            condoType = "Golf Course View";
        }
        else if (inputCode == 3)
        {
            price = 210000;
            condoType = "Lake View";
        }
        else
            {
            price = 0;
            condoType = "Unknown";
            }

        System.out.println("Condo\t: " + condoType);
        System.out.println("Price\t: $" + price);
    }
}
