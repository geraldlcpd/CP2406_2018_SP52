/**
 * Created by geraldoswald on 27/8/18.
 */
public class Horse
{
    protected String name;
    protected String color;
    protected int year;
    public Horse()
    {
        this.name = "Default Horse";
        this.color = "Black";
        this.year = 2000;
    }

    public Horse(String name, String color, int year)
    {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public void setHorse(String n, String c, int y)
    {
        name = n;
        color = c;
        year = y;

    }

    public void HorseDisplay()
    {
        System.out.println("Horse Name: " + name);
        System.out.println("Horse Color: " + color);
        System.out.println("Horse Born at: " + year);
    }
}

