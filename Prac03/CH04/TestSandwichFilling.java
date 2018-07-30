package CH04;

/**
 * Created by geraldoswald on 30/7/18.
 */
public class TestSandwichFilling
{
    public static void main(String[] args)
    {
        SandwichFilling new1 = new SandwichFilling(); // DEFAULT
        SandwichFilling new2 = new SandwichFilling("Ham Sandwich", 400);
        SandwichFilling new3 = new SandwichFilling("Beef Sandwich", 250);
        new1.PrintSandwich();
        new2.PrintSandwich();
        new3.PrintSandwich();

    }
}
