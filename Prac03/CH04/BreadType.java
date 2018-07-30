package CH04;

/**
 * Created by geraldoswald on 30/7/18.
 */
public class BreadType
{
    public String breadType;
    public double calPerBread;
    public final static String MOTTO = "The Staff of Life";

    public BreadType()
    {
        breadType = "rye";
        calPerBread = 100;
    }

    public BreadType(String breadType, double calPerBread)
    {
        this.breadType = breadType;
        this.calPerBread = calPerBread;
    }

    public void PrintData()
    {
        System.out.println(MOTTO);
        System.out.println("Bread Type\t: " + breadType);
        System.out.println("Calories\t: " + calPerBread);

    }
}
