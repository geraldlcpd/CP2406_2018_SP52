/**
 * Created by geraldoswald on 27/8/18.
 */
public class DemoCandles
{
    public static void main(String[] args)
    {
        Candle c1 = new Candle("Green", 30, 2);
        ScentedCandle c2 = new ScentedCandle("Lavender");
        c1.GetCandleAttrib();
        System.out.println();
        c2.PrintCandle();
    }

}
