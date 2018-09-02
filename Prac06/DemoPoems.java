/**
 * Created by geraldoswald on 28/8/18.
 */
public class DemoPoems
{
    public static void main(String[] args)
    {
        Couplet p1 = new Couplet("TestCouplet");
        Haiku p2 = new Haiku("TestHaiku");
        Limerick p3 = new Limerick("TestLimerick");

        p1.PrintDetails();
        p2.PrintDetails();
        p3.PrintDetails();
    }
}
