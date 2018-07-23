import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String[] args)
    {
        System.out.print("Enter First Number: >> ");
        Scanner inNum1 = new Scanner(System.in);
        int in1 = inNum1.nextInt();
        System.out.print("Enter Second Number: >> ");
        Scanner inNum2 = new Scanner(System.in);
        int in2 = inNum2.nextInt();
        displayNumbers(in1, in2);
        numberPlusFive(in1, in2);
        numberSquare(in1, in2);
    }

    public static void displayNumbers(int num1, int num2)
    {
        System.out.println("\nNum 1 = " + num1 + "\nNum 2 = " + num2);
    }

    public static void numberPlusFive(int numFive1, int numFive2)
    {
        int nFive1 = numFive1 + 5;
        int nFive2 = numFive2 + 5;
        System.out.println("\nN+5 1 = " + nFive1);
        System.out.println("N+5 2 = " + nFive2);
    }

    public static void numberSquare(int numSquare1, int numSquare2)
    {
        double nSquare1 = numSquare1;
        double nSquare2 = numSquare2;
        double nSqResult1 = Math.pow(nSquare1, 2);
        double nSqResult2 = Math.pow(nSquare2, 2);
        System.out.println("\nN^2(1) = " + String.format("%.0f", nSqResult1));
        System.out.println("N^2(2) = " + String.format("%.0f", nSqResult2));
    }
}
