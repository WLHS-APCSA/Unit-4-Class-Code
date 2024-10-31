package lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessMyNumber();

    }

    public static void guessMyNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess the number!");
        int secretNumber = (int)(Math.random()*10+1);
        // for debugging System.out.println("Test: "+secretNumber);
        System.out.print("Enter your guess: ");
        int userGuess = input.nextInt();
        while(secretNumber != userGuess){
            System.out.println("Try again!");
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
        }
        System.out.println("Correct!");
    }
}
