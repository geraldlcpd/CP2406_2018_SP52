/**
 * Created by geraldoswald on 3/9/18.
 */
public class UsePackage
{
    public static void main(String[] args)
    {
        Package newPack = new Package(20, 'M');
        //newPack.ShipCostCalculate();
        InsuredPackage newInsured = new InsuredPackage(true);

        newInsured.SetShipDet(30, 'M');
       // newInsured.ShipCostCalculate();
        newPack.PrintShippingDetails();
        System.out.println();
        newInsured.PrintShippingDetails();
    }

}
