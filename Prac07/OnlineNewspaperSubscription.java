/**
 * Created by geraldoswald on 10/9/18.
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription

{
    public OnlineNewspaperSubscription() {
        rate = 0;
        address = "";
    }

    public void setAddress(String addrOnline)
    {
        boolean atContain = false;
        int adrCount = addrOnline.length();
        for (int i = 0 ; i < adrCount ; i ++)
        {
            char currentChar = addrOnline.charAt(i);
            if (Character.toString(currentChar).equals("@"))
                atContain = true;
        }

        if(atContain == false)
        {
            System.out.println("Invalid Online Address");
            rate = 0;
        }
        else
            rate = 9;
        address = addrOnline;
    }
}
