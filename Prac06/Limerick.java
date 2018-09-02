/**
 * Created by geraldoswald on 28/8/18.
 */
public class Limerick extends Poem
{
    public String name;
    public final int LIMERICK_LINES = 5;

    public Limerick(String title)
    {
        name = title;
        super.SetProperties(name, LIMERICK_LINES);
    }
}
