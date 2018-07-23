/**
 * Created by jc477286 on 23/07/18.
 */
import java.util.Scanner;
public class CraftPricing
{
    public static void main(String[] args)
    {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter Name of Product\t: >>> ");
        String productName = name.nextLine();
        // Scanner hoursWork = new Scanner(System.in);
        System.out.print("Enter Material Cost\t\t: >>> ");
        float materialCost = new Scanner(System.in).nextFloat();
        System.out.print("Enter Hours of Work\t\t: >>> ");
        float workHours = new Scanner(System.in).nextFloat();
        float retailPrice = calcRetail(materialCost, workHours);
        System.out.println("\nProduct Name\t: " + productName);
        System.out.println("Retail Price\t: $" + String.format("%.2f", retailPrice));
    }

    public static float calcRetail(float materialCost, float workHours)
    {
        final float SHIPHANDLE = 7;
        float retailPrice = ((materialCost + 12) * workHours) + SHIPHANDLE;
        return retailPrice;
    }
}
