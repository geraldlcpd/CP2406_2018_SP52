/**
 * Created by geraldoswald on 9/9/18.
 */
public abstract class NewspaperSubscription
{
    protected String name;
    protected String address;
    protected double rate;

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String toString()
    {
        return "Address\t: " + address + "\nRate: $" + rate + "\n";
    }

    public abstract void setAddress(String addr);

}
