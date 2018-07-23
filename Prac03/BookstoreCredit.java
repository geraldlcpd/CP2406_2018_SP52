/**
 * Created by geraldoswald on 23/7/18.
 */
import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String[] args)
    {

        Scanner inputName = new Scanner(System.in);
        System.out.print("Please Enter Name\t: >>> ");
        String name = inputName.nextLine();
        Scanner inputGPA = new Scanner(System.in);
        System.out.print("Please Enter GPA\t: >>> ");
        double GPA = inputGPA.nextDouble();
        processCredit(name, GPA);
    }

    public static void processCredit(String name, double GPA)
    {
        double credit = GPA * 10;
        String message = ("Name \t= " + name + "\nGPA\t\t= " + GPA + "\nCredit\t= $" + credit);
        System.out.println(message);
    }
}
