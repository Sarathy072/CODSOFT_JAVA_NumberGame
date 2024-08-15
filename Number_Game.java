import java.util.*;

class Number_Game {
    public static void main(String[] args) {

        System.out.println("\nWelcome Buddy! Lets guess the number");
        System.out.println("Guess a number in between 0 to 100");

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int computerguess = r.nextInt(100);
        int i = 1;
        while (true) {
            int numberoftimes = i;
            System.out.println("Enter your guess number:");
            int userguess = sc.nextInt();

            if (userguess == computerguess) {
                System.out.println("\nYour guess is right");
                System.out.println("You guessed the number at " + numberoftimes + "-th attempt");
                System.out.println("So Your Score is " + numberoftimes + "\n");
                break;
            } else if (userguess < computerguess) {
                System.out.println("Its too low");
            } else if (userguess > computerguess) {
                System.out.println("Its too high");
            } else {
                System.out.println("Guess a number in between 0 to 100");
            }
            i++;
        }
    }
}
