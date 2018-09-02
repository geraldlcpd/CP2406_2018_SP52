import java.util.Scanner;

/**
 * Created by geraldoswald on 28/8/18.
 */
public class DemoSugarSmash
{
    public static void main(String[] args)
    {
        SugarSmashPlayer newP1 = new SugarSmashPlayer(2, "Player");
        PremiumSugarSmashPlayer newP2 = new PremiumSugarSmashPlayer(4, "Premium");
        System.out.print("Enter Choice: \nI) Input Score\nP) Print Score\nQ) Quit\n: >>> ");
        String userChoice = new Scanner(System.in).nextLine();
        while (!userChoice.equals("Q"))
        {
            if (userChoice.equals("I"))
            {
                System.out.println("Enter Score: Select Level");
                int levelInput = new Scanner(System.in).nextInt();
                System.out.println("Enter Score: Input Score");
                int score = new Scanner(System.in).nextInt();

                newP1.SetScore(levelInput, score);
            }
            else if (userChoice.equals("P"))
                newP1.PrintAll();
                newP2.PrintAllPremium();
            System.out.print("Enter Choice: \nI) Input Score\nP) Print Score\nQ) Quit\n: >>> ");
            userChoice = new Scanner(System.in).nextLine();
        }

        // newP1.SetScore(3, 30);

    }
}
