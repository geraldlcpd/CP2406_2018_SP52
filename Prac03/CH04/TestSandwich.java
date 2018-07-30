package CH04;

/**
 * Created by geraldoswald on 30/7/18.
 */
public class TestSandwich
{
    public static void main(String[] args)
    {
        Sandwich new1 = new Sandwich();
        Sandwich new2 = new Sandwich("normal", 100, "Egg", 200);
        Sandwich new3 = new Sandwich("New", 200, "Ham", 400);
        new1.PrintSandwich();
        new2.PrintSandwich();
        new3.PrintSandwich();
    }
}
