/**
 * Created by geraldoswald on 16/7/18.
 */
import java.util.Scanner;
public class NauticalMilesInteractive

{
    public static void main (String[] args)
    {
        final double KM = 1.852;
        final double MI = 1.15;
        Scanner inputKey = new Scanner(System.in);
        System.out.print("Enter Nautical Miles: >> ");
        float inputNM = inputKey.nextFloat();

        double resultKM = inputNM * KM;
        double resultMI = inputNM * MI;
        System.out.println("Input \t= " + inputNM + " NM");
        System.out.println("KM \t\t= " + resultKM + " Km");
        System.out.println("MI \t\t= " + resultMI + " Mi");

    }
}
