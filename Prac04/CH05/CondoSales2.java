package CH05; /**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.Scanner;

public class CondoSales2
{

    public static void main(String[] args)
    {
        System.out.print("Enter Your Choice\n\n1 - Park View\n2 - Gold Course View\n3 - Lake View\n: >>> ");
        Scanner inputValue = new Scanner(System.in);

        Scanner garageValue = new Scanner(System.in);
        int inputCode2 = inputValue.nextInt();
        System.out.print("Add Garage?\n1 - Garage\n2 - Parking Space\n: >>> ");
        int garageCode = garageValue.nextInt();
        int price2 = 0;
        String condoType2 = "";

        if (inputCode2 == 1)
        {
            price2 = 150000;
            condoType2 = "Park";
        }
        else if (inputCode2 == 2)
        {
            price2 = 170000;
            condoType2 = "Golf Course";
        }
        else if (inputCode2 == 3)
        {
            price2 = 210000;
            condoType2 = "Lake";
        }
        else
            {
            price2 = 0;
            condoType2 = "Unknown Condo Type";
            }

        if (garageCode == 1)
        {
            price2 = price2 + 5000;
            condoType2 = (condoType2 + " - With Garage");
        }
        else if (garageCode == 2)
        {
            condoType2 = (condoType2 + " - With Parking Space");
        }
        else
        {
            condoType2 = (condoType2 + " - Invalid Garage Selection");
        }
        System.out.println("Condo\t: " + condoType2);
        System.out.println("Price\t: $ " + price2);
    }
}
