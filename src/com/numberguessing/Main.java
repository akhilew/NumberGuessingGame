package com.numberguessing;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Number Guessing Game");

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);

        int attempts = 0;

        while (true) {

            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            attempts++;

            if (guess == secretNumber) {

                System.out.println("Congratulations! You guessed it!");
                System.out.println("You guessed it in " + attempts + " attempts!");

                break;

            } else if (guess < secretNumber) {

                System.out.println("Too low!");

            } else {

                System.out.println("Too high!");
            }
        }

        input.close();
    }
}