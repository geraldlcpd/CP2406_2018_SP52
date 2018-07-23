import java.util.Scanner;

/**
 * Created by geraldoswald on 16/7/18.
 */
public class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        final double ADULTMEAL = 7;
        final double CHILDMEAL = 4;
        final double ADULTCOST = 4.35;
        final double CHILDCOST = 3.10;
        double adultProfit = ADULTMEAL - ADULTCOST;
        double childProfit = CHILDMEAL - CHILDCOST;
        System.out.print("Enter Adult Meal: >> ");
        Scanner inAMeal = new Scanner(System.in);
        int aMeal = inAMeal.nextInt();

        System.out.print("Enter Child Meal: >> ");
        Scanner inCMeal = new Scanner(System.in);
        int cMeal = inCMeal.nextInt();
        double aPrice = aMeal * ADULTMEAL;
        //int aPrice = CalcPrice(aMeal, ADULTMEAL);
        double cPrice = cMeal * CHILDMEAL;
        double totalPrice = aPrice + cPrice;
        double sumProfAdult = adultProfit * aMeal;
        double sumProfChild = childProfit * cMeal;
        double sumProfit = sumProfAdult + sumProfChild;

        System.out.println("===PROFIT REPORT===\n");
        System.out.println(aMeal + " Adult Meal x $\t" + String.format("%.2f",adultProfit) + " = $" + String.format("%.2f",sumProfAdult));
        System.out.println(cMeal + " Child Meal x $\t" + String.format("%.2f",childProfit) + " = $" + String.format("%.2f",sumProfChild));
        System.out.println("Total Profit \t\t\t= $" + String.format("%.2f",sumProfit));


        System.out.println("===PURCHASE REPORT===");
        System.out.println(aMeal + " Adult Meal x $" + ADULTMEAL + " = $" + aPrice);
        System.out.println(cMeal + " Child Meal x $" + CHILDMEAL + " = $" + cPrice);
        System.out.println("Total Price\t = $" + totalPrice);
    }
}
