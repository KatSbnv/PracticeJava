package methods;

/*METHODS
 Write a method that asks a user for their name
* then greets them by the name */

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String name = scanner.nextLine();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
