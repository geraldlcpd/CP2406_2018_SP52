/**
 * Created by geraldoswald on 8/9/18.
 */
public class OutgoingPhoneCall extends PhoneCall
{
    private double callDuration;
    private double totalPrice = callPrice * callDuration;

    public OutgoingPhoneCall(String phNum, double time)
    {
        phoneNumber = phNum;
        callPrice = 0.04;
        callDuration = time;
    }
    public String getNumber()
    {
        return phoneNumber;
    }

    public double getPrice()
    {
        return callPrice;
    }

    public double getTime()
    {
        return callDuration;
    }
    public String toString() {
        return phoneNumber + "\nRate: " + callPrice + "\nMinutes: " + callDuration +
                "\nPrice: " + String.format("%.2f",callDuration * callPrice);
    }
}
