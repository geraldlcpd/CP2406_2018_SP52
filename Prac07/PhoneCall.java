/**
 * Created by geraldoswald on 8/9/18.
 */
public abstract class PhoneCall
{
    protected String phoneNumber;
    protected double callPrice;
    public PhoneCall()
    {

    }
    public PhoneCall(String phNum)
    {
        phoneNumber = phNum;
        callPrice = 0;
    }

    public abstract String getNumber();
    public abstract double getPrice();
    public abstract String toString();
}
