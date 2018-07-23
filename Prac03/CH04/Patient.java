package CH04;

/**
 * Created by jc477286 on 23/07/18.
 */
public class Patient
{
    private String idNum;
    private int age;
    private String bloodType;
    private String rhFactor;

    public Patient()
    {
        System.out.println("\nDEFAULT CONSTRUCTOR");
        idNum = "0";
        age = 0;
        bloodType = "O";
        rhFactor = "+";

    }

    public Patient(String idNum, int age, String bloodType, String rhFactor)
    {
        this.idNum = idNum;
        this.age = age;
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;

    }

    public void showData()
    {
        System.out.println("\nID\t: " + idNum);
        System.out.println("Age\t: " + age);
        System.out.println("Blood Type\t: " + bloodType);
        System.out.println("RH Factor\t: " + rhFactor);
    }
}
