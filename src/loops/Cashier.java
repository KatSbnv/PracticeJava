package loops;

/* FOR LOOP:
Write a cashier program that will scan a given
* number of items and tally the cost
*/

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many items you would like to scan: ");
        int quantity = scanner.nextInt();

        double sum = 0.0;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter price: ");
            double price = scanner.nextDouble();
            sum = price + sum;
        }
        scanner.close();
        System.out.println("Total sum is $: " + (Double) sum);

    }
}
