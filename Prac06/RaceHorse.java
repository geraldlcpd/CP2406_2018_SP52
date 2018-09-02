/**
 * Created by geraldoswald on 27/8/18.
 */
public class RaceHorse extends Horse

{
    protected int numRaces;
    public RaceHorse()
    {
        this.numRaces = 0;
    }

    public RaceHorse(int numRaces)
    {
        this.numRaces = numRaces;
    }

    public void setRaceHorse(int r)
    {
        numRaces = r;
    }
    public int getRace()
    {
        return numRaces;
    }
    public void RaceHorsePrint()
    {
        HorseDisplay();
        System.out.println("Number of Races: " + numRaces);
    }
}
