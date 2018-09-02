/**
 * Created by geraldoswald on 27/8/18.
 */
public class ScentedCandle extends Candle
{
    String scent;
    public ScentedCandle()
    {
        this.scent = "Natural";
    }

    public ScentedCandle(String s)
    {
        this.scent = s;
        SetPrice(3);
    }

    public String GetScentedAttrib()
    {
        return scent;
    }

    public void PrintCandle()
    {
        GetCandleAttrib();
        System.out.println("Scent : " + scent);
    }
}
