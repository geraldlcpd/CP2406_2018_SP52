/**
 * Created by geraldoswald on 27/8/18.
 */
public class Candle
{
    protected final int PRICE_PER_INCH = 2;
    protected String color;
    protected int ftHeight;
    protected double price;
    public Candle()
    {
        this.color = "White";
        this.ftHeight = 1;
        this.price = ftHeight * PRICE_PER_INCH;
    }

    public Candle(String c, int h, double p)
    {
        color = c;
        ftHeight = h;
        price = p * h;

    }

    public void SetCandleAttrib(String cSet, int hSet)
    {
        color = cSet;
        ftHeight = hSet;
    }

    public void SetPrice(int newPrice)
    {
        price = newPrice;
    }
    public void GetCandleAttrib()
    {
        System.out.println("Color: " + color);
        System.out.println("Height: " + ftHeight + " ft");
        System.out.println("Price: $" + String.format("%.0f",price));
    }

    public void ConstructorOverride(String candle, int candleHeight, double candlePrice)
    {
        color = candle;
        ftHeight = candleHeight;
        price = candlePrice;
    }
    public void SetCandlePrice(int sPrice)
    {
        price = sPrice;
    }

}
