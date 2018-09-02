package Debugging;
public class FixDebugCustomerMakingPurchase extends FixDebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    public FixDebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount)
    {
       amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit)
          overLimit = true;
       else
          overLimit = false;
    }
    @Override
    public void display()
    {
       display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
