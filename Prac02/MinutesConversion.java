/**
 * Created by geraldoswald on 23/7/18.
 */
public class MinutesConversion
{
    public static void main(String[] args)
    {
        final double minsPerDay = 1440;
        int minutes = 5435;
        int hours = minutes / 60;
        double days = minutes / minsPerDay;
        System.out.println(minutes + " minutes\n");
        System.out.println(hours + " hours");
        System.out.println(String.format("%.3f", days) + " days");
    }
}
