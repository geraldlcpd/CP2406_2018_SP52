/**
 * Created by WTG10_64 on 3/9/2018.
 */
public abstract class Book

{
    protected String bookTitle;
    protected double bookPrice;

    public Book(String title)
    {
        bookTitle = title;
    }

    public String getTitle()
    {
        return bookTitle;
    }

    public double getPrice()
    {
        return bookPrice;
    }

    public abstract void setPrice(double price);

    public String toString()
    {
        return "Title : " + getTitle() + "\n" + "Book Price : " + getPrice();
    }

}
