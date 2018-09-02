/**
 * Created by geraldoswald on 6/8/18.
 */
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class PasswordCheckTwoDigit
{
    public static void main(String[] args)
    {
        int randomPass = ThreadLocalRandom.current().nextInt(0, 99);
        int digitChange = ThreadLocalRandom.current().nextInt(1, 5);
        //int randomPass = 56;
        Scanner inputPass = new Scanner(System.in);
        System.out.print("Input Passcode (2 integers) (##): >>> ");
        int inputPassword = inputPass.nextInt();

        int passAttempt = 1;
        boolean validInput = false;
        while (validInput == false)
        {
            int firstDigit = randomPass / 10;
            int secondDigit = randomPass % 10;
            int firstInput = inputPassword / 10;
            int secondInput = inputPassword % 10;
            if (inputPassword == randomPass)
                validInput = true;

            else
                if (passAttempt < 6)
                {
                if (firstInput != firstDigit && secondInput == secondDigit && inputPassword < randomPass)
                {
                    System.out.println("Passcode Too Low\nFirst Digit, Verification Failure\n");
                    // inputPassword = inputPass.nextInt();
                } else if (firstInput != firstDigit && secondInput == secondDigit && inputPassword > randomPass) {
                    System.out.println("Passcode Too High\nFirst Digit, Verification failure\n");
                    //inputPassword = inputPass.nextInt();
                } else if (firstInput == firstDigit && secondInput != secondDigit && inputPassword < randomPass) {
                    System.out.println("Passcode Too Low\nSecond Digit, Verification failure\n");
                    // inputPassword = inputPass.nextInt();
                } else if (firstInput == firstDigit && secondInput != secondDigit && inputPassword > randomPass) {
                    System.out.println("Passcode Too High\nSecond Digit, Verification failure\n");
                    // inputPassword = inputPass.nextInt();
                } else if (inputPassword < randomPass) {
                    System.out.println("Passcode Too Low\n");
                    // inputPassword = inputPass.nextInt();
                } else if (inputPassword > randomPass) {
                    System.out.println("Passcode Too High\n");
                    // inputPassword = inputPass.nextInt();
                }
                System.out.print("Input Passcode (Attempt " + (passAttempt + 1) + " of 6) >>> ");
                inputPassword = inputPass.nextInt();
                passAttempt = passAttempt + 1;
            }
            else
            {
                System.out.println("Maximum input procedure reached, verification failure");
                if (firstInput != firstDigit && secondInput == secondDigit)
                {
                    if (firstDigit < 5)
                    {
                        System.out.println("Passcode has been changed. First digit increased");
                        randomPass = randomPass + (digitChange * 10); //Change 1st Digit
                    }
                    else
                        {
                            System.out.println("Passcode has been changed. First digit decreased");
                            randomPass = randomPass - (10 * digitChange);
                        }
                }
                else if (secondInput != secondDigit && firstInput == firstDigit)
                {
                    if (secondDigit < 5)
                    {
                        System.out.println("Passcode has been changed. Second digit increased");
                        randomPass = randomPass + digitChange;
                    }
                    else
                        {
                            System.out.println("Passcode has been changed. Second digit decreased");
                            randomPass = randomPass - digitChange;
                        }
                }
                else
                {
                    if (firstDigit < 5)
                    {
                        System.out.println("Passcode has been changed. First digit increased");
                        randomPass = randomPass + (digitChange * 10);
                    }
                    else
                    {
                        System.out.println("Passcode has been changed. First digit decreased ");
                        randomPass = randomPass - (10 * digitChange);
                    }
                }
                    System.out.print("Enter Passcode: >>> ");
                    passAttempt = 1;
                    inputPassword = inputPass.nextInt();
                }
            }
        System.out.println("Passcode Accepted. Lock Released");
        }

    }
