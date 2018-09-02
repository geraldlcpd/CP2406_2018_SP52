/**
 * Created by geraldoswald on 28/8/18.
 */
public class Couplet extends Poem
{
    public final int COUPLET_LINE = 2;
    public String name;
    public Couplet(String title)
    {
        name = title;
        super.SetProperties(title, COUPLET_LINE);
    }
}
