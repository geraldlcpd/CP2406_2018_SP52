import java.util.Scanner;
public class NauticalMiles
{
    public static void main (String[] args)
    {
        double KM = 1.852;
        double MI = 1.150779;
        int inputNM = 80;

        double resultKM = inputNM * KM;
        double resultMI = inputNM * MI;
        System.out.println("Input \t= " + inputNM + " NM");
        System.out.println("KM \t\t= " + resultKM + " Km");
        System.out.println("MI \t\t= " + resultMI + " Mi");
    }

}
