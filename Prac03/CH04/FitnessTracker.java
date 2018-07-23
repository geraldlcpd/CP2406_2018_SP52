package CH04;

/**
 * Created by jc477286 on 23/07/18.
 */
public class FitnessTracker
{
    private String activity;
    private int exerciseMins;
    private String date;

    public FitnessTracker()
    {
        activity = "Running";
        exerciseMins = 0;
        date = "1 January 2018";

    }

    public FitnessTracker(String activity, int exerciseMins, String date)
    {
        this.activity = activity;
        this.exerciseMins = exerciseMins;
        this.date = date;
    }

    public void showData()
    {
        System.out.println("\nFITNESS ACTIVITY");
        System.out.println("Activity: " + activity);
        System.out.println("Runtime : " + exerciseMins + " mins");
        System.out.println("Date: " + date);
    }
}
