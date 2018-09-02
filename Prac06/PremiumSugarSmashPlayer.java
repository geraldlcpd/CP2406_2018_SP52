/**
 * Created by geraldoswald on 28/8/18.
 */
public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{

    public PremiumSugarSmashPlayer()
    {
        super.playerID = 0;
        super.screenName = "None";
    }

    public PremiumSugarSmashPlayer(int pID, String name)
    {
        super.playerID = pID;
        super.screenName = name;
        super.scores = new int[49];
    }

    public void PrintAllPremium()
    {
        for (int i = 0 ; i < (scores.length); i ++)
        {
            System.out.println("Pre.L" + (i + 1) + "\t: " + super.scores[i]);
        }
    }
}
