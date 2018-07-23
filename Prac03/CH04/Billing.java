package CH04;

/**
 * Created by jc477286 on 23/07/18.
 */
public class Billing
{
    public static void main(String[] args)
    {
        Billing book1 = new Billing();
        System.out.println("Total Price 1 " + String.format("%.2f", book1.computeBill(25.50)));
        System.out.println("Total Price 2 " + book1.computeBill(25.50, 3));
        System.out.println("Total Price 3 " + book1.computeBill(25.50, 3 , 10));
    }

    public double computeBill(double price)
    {
        return price * 1.08;
    }

    public double computeBill(double price, int qty)
    {
        return (price * qty) * 1.08;
    }

    public double computeBill(double price, int qty, double coupon)
    {
        return ((price * qty) - coupon) * 1.08;
    }
}
