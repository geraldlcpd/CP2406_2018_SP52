package CH08;

/**
 * Created by geraldoswald on 21/8/18.
 */
import java.security.Key;
import java.net.MulticastSocket;
import java.util.Scanner;

public class CategorizeStrings
{
    public static String [] shortString = new String[9];
    public static String [] longString = new String[9];

    public static void main(String[] args)
    {
        KeyboardEntry();
        final String SENTINEL_VALUE = "EXIT";
        System.out.print("Enter 1 for Short String, 2 for Long String, or EXIT to Quit, ");
        String KeyEntry = new Scanner(System.in).nextLine();

        while (!KeyEntry.equals("EXIT"))
        {
            if (KeyEntry.equals("1"))
                DisplayString("Short");
            else if (KeyEntry.equals("2"))
                DisplayString("Long");
            System.out.print("Enter 1 for Short String, 2 for Long String, or EXIT to Quit, ");
            KeyEntry = new Scanner(System.in).nextLine();
        }
        System.exit(0);
    }

    protected static void KeyboardEntry()
    {
        final String QUIT_VALUE = "QUIT";

        for (int i = 0 ; i < 9 ; i ++)
        {
            System.out.print("Please Enter String No." + (i + 1) + " or type QUIT to exit");
            String keyEntry = new Scanner(System.in).nextLine();
            while (keyEntry.equals(QUIT_VALUE))
                return;
            InsertString(keyEntry, i);

        }
    }

    protected static void InsertString(String strEntry, int i)
    {
        int strLength = strEntry.length();
        if (strLength < 10)
            shortString[i] = strEntry;
        else
            longString[i] = strEntry;
    }

    protected static void DisplayString(String dispType)
    {
        String shortValue = "";
        String longValue = "";
        int shortLength = shortString.length;
        int longLength = longString.length;
        String txtPrint = "";
        if (dispType.equals("Short"))
        {
            for (int i = 0 ; i < shortLength ; i ++)
                shortValue = shortString[i];
                txtPrint = txtPrint + shortValue + "\n";
        }
        else if (dispType.equals("Long"))
        {
            for (int i = 0 ; i < longLength ; i ++)
                longValue = longString[i];
                txtPrint = txtPrint + longValue + "\n";
        }
        System.out.println(txtPrint);

    }

}
