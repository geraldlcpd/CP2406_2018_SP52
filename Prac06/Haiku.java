/**
 * Created by geraldoswald on 28/8/18.
 */
public class Haiku extends Poem
{
    public String name;
    public final int HAIKU_LINES = 3;

    public Haiku(String title)
    {
        name = title;
        super.SetProperties(name, HAIKU_LINES);
    }

}
