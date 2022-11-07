package loops;

/* DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers.
 * The user should be able to repeat this action until they
 * indicate they are done.
  */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter first number: ");
            int numberOne = scanner.nextInt();
            System.out.println("Enter second number: ");
            int numberTwo = scanner.nextInt();

            System.out.println("The sum is: " + (numberOne + numberTwo));
            System.out.println("Would you like to start over? (true/false)");
            again = scanner.nextBoolean();
        } while (again);

        scanner.close();
    }

}
