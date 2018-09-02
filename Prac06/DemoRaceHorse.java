/**
 * Created by geraldoswald on 27/8/18.
 */
public class DemoRaceHorse
{
    public static void main(String[] args)
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.HorseDisplay();
        horse1.setHorse("Champion", "Blue", 2000);
        System.out.println("\nHorse Properties Changed");
        horse1.HorseDisplay();

        horse2.RaceHorsePrint();
        horse2.setRaceHorse(20);
        System.out.println("\nHorse 2 Properties Changed");
        horse2.RaceHorsePrint();

    }

}
