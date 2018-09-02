package CH07;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class BabyNameComparison
{
    public static void main(String[] args) {
        System.out.print("Please Enter Name 1\t: >>> ");
        String inputOne = new Scanner(System.in).nextLine();

        System.out.print("Please Enter Name 2\t: >>> ");
        String inputTwo = new Scanner(System.in).nextLine();

        System.out.print("Please Enter Name 3\t: >>> ");
        String inputThree = new Scanner(System.in).nextLine();

        System.out.println("Possible Combinations");
        System.out.println("Combination 1\t: " + inputOne + " " + inputTwo);
        System.out.println("Combination 2\t: " + inputOne + " " + inputThree);
        System.out.println("Combination 3\t: " + inputTwo + " " + inputOne);
        System.out.println("Combination 4\t: " + inputTwo + " " + inputThree);
        System.out.println("Combination 5\t: " + inputThree + " " + inputOne);
        System.out.println("Combination 6\t: " + inputThree + " " + inputTwo);
    }
}
