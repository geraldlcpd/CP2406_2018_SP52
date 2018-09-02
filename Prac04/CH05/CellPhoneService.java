package CH05;

/**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.Scanner;
public class CellPhoneService

{
    public static void main(String[] args)
    {
        Scanner talkAmount = new Scanner(System.in);
        Scanner smsAmount = new Scanner(System.in);
        Scanner dataAmount = new Scanner(System.in);
        System.out.print("Enter Talk Time\t: >> ");
        int talk = talkAmount.nextInt();
        System.out.print("Enter SMS\t: >> ");
        int sms = smsAmount.nextInt();
        System.out.print("Enter Data in GB\t: >> ");
        int data = dataAmount.nextInt();
        String planName = PlanName(talk, sms, data);
        System.out.println("Your Recommended plan is " +planName);
    }

    public static String PlanName(int talk, int sms, int data)
    {
        String planName;
        if (talk < 500 && (sms == 0 && data == 0))
            planName = "Plan A - $49";
        else if (talk < 500 && (sms != 0 && data == 0))
            planName = "Plan B - $55";
        else if (talk > 500 && (sms < 100 && data == 0))
            planName = "Plan C - $61";
        else if (talk > 500 && (sms > 100 && data == 0))
            planName = "Plan D - $70";
        else if (data < 2)
            planName = "Plan E - $79";
        else
            planName = "Plan F - $87";
        return planName;
    }
}

