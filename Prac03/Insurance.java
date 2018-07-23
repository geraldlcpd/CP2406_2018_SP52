/**
 * Created by geraldoswald on 23/7/18.
 */
import java.util.Scanner;
public class Insurance
{
    public static void main(String[] args)
    {
        Scanner inputAge = new Scanner(System.in);
        System.out.print("Enter Age\t: >>> ");
        int ageInput = inputAge.nextInt();
        double insurancePrice = calcInsurancePrice(ageInput);
        System.out.print("Your Premium Price\t: $" + String.format("%.2f", insurancePrice));
    }

    public static double calcInsurancePrice(int age)
    {
        final double BASE_PRICE = 20;
        double ageInDecade = age / 10;
        double premiumPrice = (ageInDecade + 15) * BASE_PRICE;
        return premiumPrice;
    }
}
