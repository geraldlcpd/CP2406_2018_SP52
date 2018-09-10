/**
 * Created by geraldoswald on 10/9/18.
 */
public class DemoSubscriptions

{
    public static void main(String[] args)
    {
        NewspaperSubscription newPaper = new PhysicalNewspaperSubscription();
        NewspaperSubscription newOnline = new OnlineNewspaperSubscription();

        newPaper.setAddress("");
        System.out.println(newPaper);
        newPaper.setAddress("123 Street");
        System.out.println(newPaper);

        newOnline.setAddress("Whatever Address");
        System.out.println(newOnline);
        newOnline.setAddress("@gmail.com");
        System.out.println(newOnline);
    }
}
