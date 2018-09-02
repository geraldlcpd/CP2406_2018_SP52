/**
 * Created by geraldoswald on 28/8/18.
 */
public class PetSold extends ItemSold
{

    public boolean isVaccine;
    public boolean isNeutred;
    public boolean isHouseBroken;

    public PetSold()
    {
        this.isVaccine = false;
        this.isNeutred = false;
        this.isHouseBroken = false;
    }

    public PetSold(boolean vaccine, boolean neutred, boolean houseBroken)
    {

        isVaccine = vaccine;
        isNeutred = neutred;
        isHouseBroken = houseBroken;
    }
    public void PetStateChange(boolean v, boolean n, boolean hB)
    {
        isVaccine = v;
        isNeutred = n;
        isHouseBroken = hB;

    }

    public void SetNewInvoice(int iNum)
    {
        super.SetInvoice(iNum);
    }

    public void SetNewDescription(String descript)
    {
        super.SetDescription(descript);

    }

    public void SetNewPrice(double newPrice)
    {
        super.SetPrice(newPrice);
    }

    public void GetAttribute()
    {
        super.GetInvoice();
        System.out.println("Vaccined\t= " + String.valueOf(isVaccine));
        System.out.println("Neutred\t= " + String.valueOf(isNeutred));
        System.out.println("HouseBroke\t= " + String.valueOf(isHouseBroken));
    }

}
