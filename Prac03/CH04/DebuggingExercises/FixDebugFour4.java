// This class discounts prices by 10%
public class FixDebugFour4
{
   static final double DISCOUNT_RATE = 0.10;
   public static void main(String args[])
   {

      int price = 100;
      double price2 = 100.00;
      tenPercentOff(price);
      tenPercentOff(price2);
   }
   public static void tenPercentOff(int p)
   {
       double newPrice = p - (p * DISCOUNT_RATE);
       System.out.println("Ten percent off  "+ p);
       System.out.println("  New price is " + newPrice);
   }
   public static void tenPercentOff(double p)
   {

       double newPrice = p - (p * DISCOUNT_RATE);
       System.out.println("Ten percent off " + p);
       System.out.println("  New price is " + newPrice);
   }
}
