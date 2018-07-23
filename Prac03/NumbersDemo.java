/**
 * Created by geraldoswald on 23/7/18.
 */

public class NumbersDemo
{
    public static void main(String[] args)
    {
        final int NUM_1 = 10;
        final int NUM_2 = 25;
        displayNumbers(NUM_1, NUM_2);
        numberPlusFive(NUM_1, NUM_2);
        numberSquare(NUM_1, NUM_2);
    }

    public static void displayNumbers(int num1, int num2)
    {
        System.out.println("N1 = " + num1 + "\nN2 = " + num2);
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
        System.out.println("\nN^2(1) = " + nSqResult1);
        System.out.println("N^2(2) = " + nSqResult2);
    }
}
