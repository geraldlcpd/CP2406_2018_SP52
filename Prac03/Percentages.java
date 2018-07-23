/**
 * Created by geraldoswald on 23/7/18.
 */
import java.util.Scanner;
public class Percentages
{

    public static void main(String[] args)
    {
        autoAssignVar();// First Instance = Automatically Assigned Variables
        userInputVariable(); // Second Instance =

    }

    public static void autoAssignVar()
    {
        final double NUM1 = 2.0;
        final double NUM2 = 5.0;
        System.out.println("=== VARIABLE VALUE ASSIGNED ===");
        percentCount(NUM1, NUM2);
        percentCountRev(NUM1, NUM2);

    }

    public static void percentCount(double num1, double num2)
    {
        double pctCount = (num1 / num2) * 100;
        System.out.println(num1 + " is " + String.format("%.0f",pctCount) + " percent of " + num2);
    }

    public static void percentCountRev(double num1, double num2)
    {
        double pctCountRev = (num2 / num1) * 100;
        System.out.println(num2 + " is " + String.format("%.0f",pctCountRev) + " percent of " + num1);
    }

    public static void userInputVariable()
    {
        System.out.println("\n=== USER INPUT ===");
        System.out.print("Enter Number One: >> ");
        Scanner inputNum1 = new Scanner(System.in);
        int inNum1 = inputNum1.nextInt();
        System.out.print("Enter Number Two: >> ");
        Scanner inputNum2 = new Scanner(System.in);
        int inNum2 = inputNum2.nextInt();
        percentCount(inNum1, inNum2);
        percentCountRev(inNum1, inNum2);

    }
}
