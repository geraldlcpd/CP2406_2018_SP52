/**
 * Created by WTG10_64 on 3/9/2018.
 */

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setPrice(37.99);
    }

    public void setPrice(double price) {
        super.bookPrice = price;
    }


}