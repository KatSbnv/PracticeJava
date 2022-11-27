package loops;

import java.util.Random;

public class RollTheDie {
    public static final int spaces = 20;
    public static final int motion = 5;
    public static int position = 0;
    static boolean endGame = false;
    static String delimiter1 = "---------------------------------------------";
    static String delimiter2 = "#############################################";

    public static void main(String[] args) {
        checkMoves();
    }

    public static void checkMoves() {
        for (int i = 0; i < motion; i++) {
            System.out.println("Please, roll the die!");
            int currentNumber = generateNumber();
            System.out.println("You rolled the die #" + (i + 1) + " Your number is: " + currentNumber);
            position = position + currentNumber;

            if (position > spaces) {
                System.out.println(delimiter2 + "\n" + "I'm sorry, but you're lost. You're at " + position);
                endGame = false;
                break;
            } else if (position == 20) {
                System.out.println("You're now on space #" + position);
                System.out.println(delimiter2 + "\n" + "Congratulations! You won!");
                endGame = false;
                break;
            } else {
                System.out.println("You're now on space #" + position);
                endGame = true;
            }

            System.out.println("You have to go to " + (spaces - position) + " spaces to win");
            System.out.println(delimiter1);
        }

        if (endGame) {
            System.out.println("You've done your 5 moves. Unfortunately, you didn't get 20. Game Over");
        }
    }
    public static int generateNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
