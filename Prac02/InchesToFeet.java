/**
 * Created by geraldoswald on 16/7/18.
 */
public class InchesToFeet

{
    public static void main(String[] args)
    {
        final int FTPERINCH = 12;
        int inchAmount = 86;
        int feetIn = inchAmount / FTPERINCH;
        int inchIn = inchAmount % FTPERINCH;

        System.out.print(inchAmount + " inch >> \n");
        System.out.println(feetIn + " feet");
        System.out.println(inchIn + " inch");
    }

}
