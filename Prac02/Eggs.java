/**
 * Created by geraldoswald on 16/7/18.
 */
import java.util.Scanner;
public class Eggs

{
    public static void main(String[] args)
    {
        final int PCPERDOZ = 12;
        final double DOZPRICE = 3.25;
        final double PCPRICE = 0.45;
        Scanner inputEgg = new Scanner(System.in);
        int egg;
        System.out.print("Enter Number of Eggs ordered: >> ");
        egg = inputEgg.nextInt();
        int dozAmount = egg / PCPERDOZ;
        int pcAmount = egg % PCPERDOZ;
        double dozPrice = dozAmount * DOZPRICE;
        double pcPrice = pcAmount * PCPRICE;
        double totalPrice = dozPrice + pcPrice;
        System.out.println("Order\t\t\t: " + egg + " Eggs");
        System.out.println(dozAmount + " Dozen \tx \t$3.25 = $"+ dozPrice);
        System.out.println(pcAmount + " Pcs \t\tx \t$0.45 = $" + pcPrice);
        System.out.println("Total price \t\t\t$" + totalPrice);

    }
}
