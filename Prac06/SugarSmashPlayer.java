/**
 * Created by geraldoswald on 28/8/18.
 */
public class SugarSmashPlayer
{
    protected int playerID;
    protected String screenName;
    protected int [] scores = new int[9];
    public SugarSmashPlayer()
    {
        playerID = 0;
        screenName = "None";
    }

    public SugarSmashPlayer(int pID, String name)
    {
        playerID = pID;
        String pIDText = Integer.toString(playerID);
        screenName = name;
        this.scores = new int[9];
    }

    public void SetScore(int level, int score)
    {
        try
        {
            scores[level - 1] = score;
        }
        catch (IndexOutOfBoundsException NoValidLevel)
        {
            System.out.println("Level Does Not Exist, Try again");
        }

    }

    public void PrintScore(int level)
    {
        System.out.println("Score for Level " + (level) + " is " + scores[level-1]);
    }

    public void PrintAll()
    {
        for (int i = 0 ; i < scores.length ; i ++)
        {
            System.out.println("L" + (i + 1) + "\t: " + scores[i]);
        }
    }
}

