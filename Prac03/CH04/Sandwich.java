package CH04;

/**
 * Created by geraldoswald on 30/7/18.
 */
public class Sandwich
{
    private double totalCals;
    public String breadIngredient;
    public String fillType;
    public double calBread;
    public double calFill;
    // public int increment = 1;

    public Sandwich() // Default Value Constructor for Sandwich = Bread + Filling
    {

        BreadType newBread = new BreadType();
        SandwichFilling newFill = new SandwichFilling();

        String newBreadType = newBread.breadType;
        double newBreadCal = newBread.calPerBread;
        String newFillType = newFill.fillType;
        double newFillCal = newFill.calInServing;

        totalCals = (2 * newBread.calPerBread) + newFill.calInServing;
        BuildSandwich(newBreadType, newBreadCal, newFillType, newFillCal);

    }

    public Sandwich(String breadIngredient, double calBread, String fillType, double calFill)
    {
        this.breadIngredient = breadIngredient;
        this.calBread = calBread;
        this.fillType = fillType;
        this.calFill = calFill;
        BuildSandwich(breadIngredient, calBread, fillType, calFill);

    }

    public void BuildSandwich(String breadIngredient, double calBread, String fillType, double calFill)
    {
        BreadType newBread1 = new BreadType(breadIngredient, calBread);
        SandwichFilling newFill1 = new SandwichFilling(fillType, calFill);
        totalCals = (2 * newBread1.calPerBread) + newFill1.calInServing;
        this.breadIngredient = breadIngredient;
        this.fillType = fillType;
    }

    public void PrintSandwich()
    {
        System.out.println(BreadType.MOTTO);
        System.out.println("Bread\t\t: " + breadIngredient);
        System.out.println("Bread Cal\t: " + calBread);
        System.out.println("Fill\t\t: " + fillType);
        System.out.println("Fill Cal\t: " + calFill);
        System.out.println("Total Cal\t: " + totalCals + "\n");
    }

}
