package CH04;

/**
 * Created by jc477286 on 23/07/18.
 */
public class TestPatient
{
    public static void main(String[] args)
    {
        Patient person1 = new Patient();
        Patient person2 = new Patient("0125", 23, "A", "-");
        person1.showData();
        person2.showData();
    }

}

