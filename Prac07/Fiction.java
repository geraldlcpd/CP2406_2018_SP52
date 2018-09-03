/**
 * Created by WTG10_64 on 3/9/2018.
 */
public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice(24.99);
    }

    public void setPrice(double price)
    {
        super.bookPrice = price;
    }

}
