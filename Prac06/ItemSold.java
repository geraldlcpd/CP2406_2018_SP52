/**
 * Created by geraldoswald on 28/8/18.
 */
public class ItemSold
{
    public int invoiceNum;
    public String description;
    public double price;


    public ItemSold()
    {
        this.invoiceNum = 0;
        this.description = "Nothing";
        this.price = 0;
    }

    public ItemSold(int iNum, String desc, double p)
    {
        invoiceNum = iNum;
        description = desc;
        price = p;
    }

    public void SetInvoice(int iNum)
    {
        invoiceNum = iNum;
    }

    public void SetDescription(String desc)
    {
        description = desc;
    }

    public void SetPrice(double p)
    {
        price = p;
    }

    public void GetInvoice()
    {
        System.out.println("INV Number\t: " + invoiceNum);
        System.out.println("Description\t: " + description);
        System.out.println("Price\t: $" + price);
    }

}
