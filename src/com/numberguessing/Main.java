package com.numberguessing;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Number Guessing Game");

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

        System.out.println("Your guess: " + guess);
        System.out.println("The secret number is: " + secretNumber);

        input.close();
    }
}