package CH04;

/**
 * Created by jc477286 on 23/07/18.
 */
public class BloodData
{
    private String bloodType;
    private String rhFactor;
    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
        System.out.println("DEFAULT DATA");
    }

    public BloodData(String bloodType, String rhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void showData()
    {
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Rhesus Factor: " + rhFactor);
    }
}