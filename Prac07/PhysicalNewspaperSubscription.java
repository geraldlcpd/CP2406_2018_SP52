/**
 * Created by geraldoswald on 10/9/18.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    public PhysicalNewspaperSubscription()
    {
        rate = 0;
        address = "";
    }

    public void setAddress(String a) {
        if (a.length() < 1)
        {
            System.out.println("Invalid Address");
            rate = 0;
        }
        else
            rate = 15;
        address = a;
    }
}
