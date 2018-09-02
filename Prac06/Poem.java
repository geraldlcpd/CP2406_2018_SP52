/**
 * Created by geraldoswald on 28/8/18.
 */
public class Poem
{
    public String name;
    public int numLines;

    public Poem()
    {
        name = "Poem";
        numLines = 0;
    }
    public Poem(String title, int lines)
    {
        name = title;
        numLines = lines;
    }

    public String GetName()
    {
        return name;
    }

    public int GetLines()
    {
        return numLines;
    }

    public void SetProperties(String title, int lines)
    {
        name = title;
        numLines = lines;
    }

    public void PrintDetails()
    {
        System.out.println("\nPOEM DETAILS");
        System.out.println("Type\t: " + name);
        System.out.println("NumLines\t: " + numLines);
    }
}
