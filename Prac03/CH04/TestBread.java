package CH04;

/**
 * Created by geraldoswald on 30/7/18.
 */
public class TestBread
{
    public static void main(String[] args)
    {
        BreadType new1 = new BreadType();
        BreadType new2 = new BreadType("flour", 300);
        BreadType new3 = new BreadType("rye", 260);
        new1.PrintData();
        new2.PrintData();
        new3.PrintData();
    }
}
