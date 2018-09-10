/**
 * Created by geraldoswald on 8/9/18.
 */
public class IncomingPhoneCall extends PhoneCall
{
    public IncomingPhoneCall(String phNum)
    {
        phoneNumber = phNum;
        callPrice = 0.02;
    }
    public String getNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return callPrice;
    }

    public String toString() {
        return phoneNumber + "\nRate: " + callPrice + "\nPrice: " + callPrice;
    }
}
