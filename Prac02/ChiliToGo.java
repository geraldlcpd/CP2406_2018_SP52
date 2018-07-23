import java.util.Scanner;

/**
 * Created by geraldoswald on 16/7/18.
 */
public class ChiliToGo
{
    public static void main(String[] args)
    {
        final int ADULTMEAL = 7;
        final int CHILDMEAL = 4;
        System.out.print("Enter Adult Meal: >> ");
        Scanner inAMeal = new Scanner(System.in);
        int aMeal = inAMeal.nextInt();

        System.out.print("Enter Child Meal: >> ");
        Scanner inCMeal = new Scanner(System.in);
        int cMeal = inCMeal.nextInt();
        int aPrice = aMeal * ADULTMEAL;
        //int aPrice = CalcPrice(aMeal, ADULTMEAL);
        int cPrice = cMeal * CHILDMEAL;
        int totalPrice = aPrice + cPrice;

        System.out.println(aMeal + " Adult Meal x $" + ADULTMEAL + " = $" + aPrice);
        System.out.println(cMeal + " Child Meal x $" + CHILDMEAL + " = $" + cPrice);
        System.out.println("Total Price\t = $" + totalPrice);
    }
}
