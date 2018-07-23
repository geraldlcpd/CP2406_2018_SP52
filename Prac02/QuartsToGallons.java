/**
 * Created by geraldoswald on 16/7/18.
 */

public class QuartsToGallons
{
    public static void main (String[] args)
    {
        final int QUARTS = 4;
        int JobAmount = 25;
        int GalNeed = JobAmount / QUARTS;
        int QrtNeed = JobAmount % QUARTS;
        System.out.println("A job that needs " + JobAmount + " quarts requires\n \t" + GalNeed + " gallons + \n \t" +
        QrtNeed + " quarts");

    }
}
