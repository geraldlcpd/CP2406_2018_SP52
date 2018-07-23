/**
 * Created by geraldoswald on 23/7/18.
 */
import java.util.Scanner;
public class MetricConversion
{
    public static void main(String[] args)
    {
        System.out.print("Enter a Value: >> ");
        Scanner input = new Scanner(System.in);
        double valInput = input.nextDouble();
        inToCm(valInput);
        galToLitre(valInput);
    }

    public static void inToCm(double inValue)
    {
        final double CM_PER_INCH = 2.54;
        double cmValue = inValue * CM_PER_INCH;
        System.out.println(inValue + " inch \t\t>> " + String.format("%.2f", cmValue) + " cm");
    }

    public static void galToLitre(double galValue)
    {
        final double LITRE_PER_GAL = 3.7854;
        double litreValue = galValue * LITRE_PER_GAL;
        System.out.println(galValue + " gallons \t>> " + String.format("%.2f", litreValue) + " litre");
    }
}
