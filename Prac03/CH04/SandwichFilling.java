package CH04;

/**
 * Created by geraldoswald on 30/7/18.
 */
public class SandwichFilling
{
    public String fillType;
    public double calInServing;

    public SandwichFilling()
    {
        fillType = "Egg Salad";
        calInServing = 100;
    }

    public SandwichFilling(String fillType, double calInServing)
    {
        this.fillType = fillType;
        this.calInServing = calInServing;
    }

    public void PrintSandwich()
    {
        System.out.println("Fill Type\t: " + fillType);
        System.out.println("Calories\t: " + calInServing + "\n");
    }
}
