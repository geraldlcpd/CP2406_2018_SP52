package CH08;

/**
 * Created by geraldoswald on 20/8/18.
 */
import java.util.Scanner;
public class CarCareChoice
{
    public static void main(String[] args)
    {
      String [] servicesType = {"oil change", "tire rotation", "battery check", "brake inspection"};
      int [] servicePrice = {25, 22, 15, 5};
      int price = 0;
      boolean svcAvail = true;
      System.out.print("Please Select Service Type: >> ");
      String serviceChoice = new Scanner(System.in).nextLine();
      for (int i = 0 ; i < 4 ; i ++)
      {
          String svcChoiceNow = servicesType[i];
          if (serviceChoice.equals(svcChoiceNow))
          {
              price = servicePrice[i];
              svcAvail = true;
          }
          else
              svcAvail = false;
      }
      if (svcAvail == true)
      {
          System.out.println("You Selected " + serviceChoice);
          System.out.println("Price : $" + price);
      }
      else
      {
          System.out.println("Unknown Service Selected");
      }


    }

}
