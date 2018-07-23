/**
 * Created by geraldoswald on 23/7/18.
 */
public class Dollars
{
    public static void main(String[] args)
    {
        int dollarAmount = 524;
        int note20 = dollarAmount / 20; int mod20 = dollarAmount % 20;
        int note10 = mod20 / 10; int mod10 = dollarAmount % 10;
        int note05 = mod10 / 05; int mod05 = dollarAmount % 05;
        int note01  = mod05;

        System.out.println("Dollar Amount = " + dollarAmount);
        System.out.println("$20\t = " + note20 + " pcs");
        System.out.println("$10\t = " + note10 + " pcs");
        System.out.println("$5\t = " + note05 + " pcs");
        System.out.println("$1\t = "+ note01 + " pcs");
    }
}
