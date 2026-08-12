package com.numberguessing;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int bestScore = 0;

        System.out.println("==========================");
        System.out.println("   NUMBER GUESSING GAME");
        System.out.println("==========================");

        while (playAgain) {

            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println();
            System.out.println("I'm thinking of a number between 1 and 100.");

            while (true) {

                System.out.print("Enter your guess: ");

                String userInput = input.nextLine();

                int guess;

                try {
                    guess = Integer.parseInt(userInput.trim());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == secretNumber) {

                    System.out.println("Congratulations! You guessed it!");
                    System.out.println("You guessed it in " + attempts + " attempts!");

                    if (bestScore == 0 || attempts < bestScore) {
                        bestScore = attempts;
                        System.out.println("New High Score!");
                    }

                    System.out.println("Best Score: " + bestScore + " attempts");

                    break;

                } else if (guess < secretNumber) {

                    System.out.println("Too low!");

                } else {

                    System.out.println("Too high!");
                }
            }

            while (true) {

                System.out.print("\nPlay again? (y/n): ");

                String answer = input.nextLine().trim();

                if (answer.equalsIgnoreCase("y")) {
                    break;
                }

                if (answer.equalsIgnoreCase("n")) {
                    playAgain = false;
                    break;
                }

                System.out.println("Please enter y or n.");
            }
        }

        input.close();

        System.out.println();
        System.out.println("==========================");
        System.out.println("      THANKS FOR PLAYING!");
        System.out.println("==========================");
    }
}