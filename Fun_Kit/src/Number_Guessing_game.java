import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomNumber = new Random();

        System.out.println("Please enter range: ");

        System.out.print("From: ");
        int from = sc.nextInt();

        System.out.print("To: ");
        int to = sc.nextInt();

        int inputNumber, guess = 0;
        int random = randomNumber.nextInt(from,to+1);

        System.out.print("Now Take a Guess: ");

        do {
            inputNumber = sc.nextInt();
            if (inputNumber < random) {
                System.out.print("Too Low. Try Again: ");
            }
            else if (inputNumber > random) {
                System.out.print("Too High. Try Again: ");
            }
            else {
                System.out.println("Congratulation!!! The Number Was " + inputNumber);
                System.out.printf("You Take %d Guess", guess+1);
            }
            guess++;
        } while (inputNumber != random);

        sc.close();
    }
}
