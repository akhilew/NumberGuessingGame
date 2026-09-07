package com.numberguessing;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int bestScore = 0;

        System.out.println("==========================");
        System.out.println("   NUMBER GUESSING GAME");
        System.out.println("==========================");

        while (playAgain) {

            int secretNumber = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
            int attempts = 0;
            boolean won = false;

            System.out.println();
            System.out.println("I'm thinking of a number between "
                    + MIN_NUMBER + " and " + MAX_NUMBER + ".");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

            while (attempts < MAX_ATTEMPTS) {

                System.out.print("Enter your guess: ");

                if (!input.hasNextLine()) {
                    playAgain = false;
                    break;
                }

                String userInput = input.nextLine();

                int guess;

                try {
                    guess = Integer.parseInt(userInput.trim());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                    continue;
                }

                if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                    System.out.println("Please enter a number between "
                            + MIN_NUMBER + " and " + MAX_NUMBER + ".");
                    continue;
                }

                attempts++;

                if (guess == secretNumber) {

                    won = true;

                    System.out.println("Congratulations! You guessed it!");
                    System.out.println("You guessed it in " + attempts
                            + (attempts == 1 ? " attempt!" : " attempts!"));

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

                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Attempts remaining: "
                            + (MAX_ATTEMPTS - attempts));
                }
            }

            if (!playAgain) {
                break;
            }

            if (attempts == MAX_ATTEMPTS && !won) {
                System.out.println("Game Over!");
                System.out.println("The correct number was: " + secretNumber);
            }

            while (true) {

                System.out.print("\nPlay again? (y/n): ");

                if (!input.hasNextLine()) {
                    playAgain = false;
                    break;
                }

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