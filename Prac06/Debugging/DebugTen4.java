// A customer's purchase is approved if the
// purchase does not exceed the credit limit
package Debugging;
public class DebugTen4
{
   public static void main(String args[])
   {
      int id = 12241;
      String name = "Franklin";
      double credit = 1000.00;
      double purchase = 1325.77;
      FixDebugCustomerMakingPurchase cust = new FixDebugCustomerMakingPurchase(1, "John", 2000, 100);
      cust.display();
   }
}