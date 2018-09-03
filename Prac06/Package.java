/**
 * Created by geraldoswald on 3/9/18.
 */
public class Package
{
    protected int shipWeight;
    protected char shipMethod;
    protected double shipCost;
    protected double shipNoInsurance;
    protected double insurancePrice;
    protected double sumCostAll;
    private String shipText;
    private char[] shipList = {'A', 'M', 'T'};
    // private String[] shipDesc = {"Air", "Mail", "Truck"};
    private double[] priceAir = {2, 3, 4.5};
    private double[] priceMail = {0.5, 1.5, 2.15};
    private double[] priceTruck = {1.5, 2.35, 3.25};
    private double[] priceChosen = new double[3];
    public Package()
    {
        shipWeight = 0;
        shipMethod = 'A';
    }

    public Package(int weight, char method)
    {
        shipWeight = weight;
        shipMethod = method;
        ShipCostCalculate();
        sumCostAll = shipCost + insurancePrice;
    }

    public void SetShipmentDetails(int w2, char m2)
    {
        shipWeight = w2;
        shipMethod = m2;
        ShipCostCalculate();
        sumCostAll = shipCost + insurancePrice;
    }


    public void ShipCostCalculate()
    {
        double totalCost;
        if (shipMethod == 'A') {
            priceChosen = priceAir;
            shipText = "Air";
        }
        else if (shipMethod == 'M') {
            priceChosen = priceMail;
            shipText = "Mail";
        }
        else if (shipMethod == 'T') {
            priceChosen = priceTruck;
            shipText = "Truck";
        }

        if (shipWeight <= 8)
            shipCost = shipWeight * priceChosen[0];
        else if (shipWeight >= 9 && shipWeight <= 16)
            shipCost = shipWeight * priceChosen[1];
        else
            shipCost = shipWeight * priceChosen[2];
    }

    public void PrintShippingDetails()
    {
        System.out.println("Weight\t: " + shipWeight + " ounces");
        System.out.println("Method\t: " + shipText);
        System.out.println("Price\t: $" + shipCost);
        System.out.println("Insur\t: $" + insurancePrice);
        System.out.println("Total\t: $" + sumCostAll);
    }
}
