/**
 * Created by geraldoswald on 16/7/18.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive
{
    public static void main (String[] args)
    {
        final int QUARTSPERGALLON = 4;
        int JobAmount;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please Enter Job Amount: >>> ");
        JobAmount = inputDevice.nextInt();
        int GalsNeed = JobAmount / QUARTSPERGALLON;
        int QrtsNeed = JobAmount / QUARTSPERGALLON;
        System.out.print("The Job that needs " + JobAmount + " quarts requires "
                + GalsNeed + " Gallons and " + QrtsNeed + " quarts");
        JOptionPane.showMessageDialog(null, "The Job that needs " + JobAmount + " quarts requires"
        + GalsNeed + " Gallons and " + QrtsNeed + " quarts");

    }

}
