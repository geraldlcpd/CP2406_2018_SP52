/**
 * Created by geraldoswald on 23/7/18.
 */
import java.util.Scanner;
public class PaintCalculator
{
    public static void main(String[] args)
    {
        Scanner width = new Scanner(System.in);
        System.out.print("Enter Width \t: >> ");
        double inWidth = width.nextDouble();
        Scanner height = new Scanner(System.in);
        System.out.print("Enter Height \t: >> ");
        double inHeight = height.nextDouble();
        Scanner depth = new Scanner(System.in);
        System.out.print("Enter Depth \t: >> ");
        double inDepth = depth.nextDouble();
        double galsNeeded = calcGals(inWidth, inHeight, inDepth);
        double paintPrice = calcPrice(galsNeeded);
        System.out.println("Total Price of Paint\t: ~$" + String.format("%.2f", paintPrice));
    }

    public static double calcGals(double width, double height, double depth)
    {
        final int SQFT_PERGALLON = 350;
        double totalArea = width * height * depth;
        double galsNeed = totalArea / SQFT_PERGALLON;
        System.out.println("Total Gallons Needed\t: ~" + String.format("%.2f", galsNeed) + "\t gals");
        return galsNeed;
    }

    public static double calcPrice(double galsPaint)
    {
        final double PAINT_PRICE = 32;
        double totalPrice = galsPaint * PAINT_PRICE;

        return totalPrice;
    }
}
