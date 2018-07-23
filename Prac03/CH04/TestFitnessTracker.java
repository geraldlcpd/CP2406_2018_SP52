package CH04;

/**
 * Created by jc477286 on 23/07/18.
 */
public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker newAct1 = new FitnessTracker("Sit Up", 10, "2 January 2018");
        FitnessTracker newAct2 = new FitnessTracker();
        newAct1.showData();
        newAct2.showData();

    }
}
