

/**
 * Created by geraldoswald on 3/9/18.
 */
public class InsuredPackage extends Package
{
    private double[] insurancePriceList = {2.45, 3.95, 5.55};
    protected double insCost;
    private int shipMethod;
    private boolean isInsured;
    protected double sumCost;
    public InsuredPackage()
    {
        isInsured = false;
        shipWeight = 0;
        shipMethod = 'A';

    }

    public InsuredPackage(boolean insurance)
    {
        isInsured = insurance;
        if (isInsured == true)
            insurancePrice = InsuranceCalculate();
        else
            insCost = 0;
        //sumCostAll = insurancePrice + shipCost;
    }

    private double InsuranceCalculate()
    {
        if (shipCost <= 1)
            insCost = 2.45;
        else if (shipCost >= 1.01 && shipCost <= 3.00)
            insCost = 3.95;
        else
            insCost = 5.55;
      //  sumCostAll = shipCost + insCost;
        return insCost;


    }

    public void SetShipDet(int w, char m)
    {
        SetShipmentDetails(w, m);
    }
}
