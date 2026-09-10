# Number Guessing Game

A console-based Number Guessing Game built using Java, where the player tries to guess a randomly generated number between 1 and 100 within a limited number of attempts using hints.

## Features

- Generates a random number between 1 and 100
- Allows up to 10 valid guesses per game
- Provides hints after each valid guess
- Handles invalid and out-of-range input without consuming an attempt
- Tracks the best score during the current program session
- Supports multiple rounds through a play-again option

## Requirements

- Java Development Kit (JDK) 17

## How to Run

1. Clone or download the repository.
2. Open a terminal or command prompt in the project folder.
3. Compile and run the program:

```bash
javac -d bin src/com/numberguessing/Main.java
java -cp bin com.numberguessing.Main
```

## How to Play

1. The game generates a secret number between 1 and 100.
2. Enter your guesses and use the hints provided after each valid attempt.
3. Try to guess the correct number within 10 valid guesses.
4. Invalid or out-of-range input does not count as an attempt.
5. After winning or losing, you can choose to play again.

## Sample Gameplay

```text
==========================
   NUMBER GUESSING GAME
==========================

I'm thinking of a number between 1 and 100.
You have 10 attempts.

Enter your guess: 36
Too high!
Attempts remaining: 9

Enter your guess: 13
Too low!
Attempts remaining: 8

Enter your guess: 14
Congratulations! You guessed it!
You guessed it in 3 attempts!
New High Score!
Best Score: 3 attempts

Play again? (y/n): n

==========================
      THANKS FOR PLAYING!
==========================
```

## Technologies Used

- Java 17
- Java Standard Library (`java.util.Scanner`, `java.util.Random`)
- Git and GitHub

## Learning Outcomes

- Java fundamentals (loops, conditionals, methods)
- User input handling with `Scanner`
- Exception handling (`NumberFormatException`)
- Input validation
- Random number generation
- Basic Git and GitHub workflow

## Project Structure

```text
NumberGuessingGame/
├── README.md
├── LICENSE
├── .gitignore
└── src/
    └── com/
        └── numberguessing/
            └── Main.java
```

## License

This project is licensed under the MIT License.