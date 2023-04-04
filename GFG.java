import java.util.Scanner;

public class GFG {
    public static void
    guessthenumber()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100
                * Math.random());
        int K = 5;
        int i, guess;
        System.out.println("Welcome to the number guessing game\n" +
                "Choose the numbers in between 1 to 100\n"+
                "You have 5 trials to win\n"+
                "Lets the game begin\n"+
                "Enter the number\n");
        for (i = 0; i < K; i++) {
            System.out.println(
                    "Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println(
                        "Well done"
                                + " You Guessed the number correctly");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "The number is "
                                + "greater than " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "The number is"
                                + " less than " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                    "You Exceeded maximum limit of attempt try again"
                            + " K trials.");

            System.out.println(
                    "The correct number is " + number);

        }
    }
    public static void
    main(String arg[])
    {
        guessthenumber();
    }
}
