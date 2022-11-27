package methods;
/*Write an instant credit check program that approves anyone
* who makes more than $25 000 and has a credit score of 700
* or better. Reject all others
*
* Initialize what we know
Get what we don’t know
Check if the user is qualified
Notify the user*/

import java.util.Scanner;


public class CreditCheck {
    public static int minSalary = 25000;
    public static int minCreditScore = 700;

    public static void main(String[] args) {
        System.out.println("Please enter your salary below: ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.println("Please enter your credit score below: ");
        int creditScore = scanner.nextInt();
        checkCredit(salary, creditScore);

        scanner.close();
    }

    public static void checkCredit(int number, int creditScore) {
        if ((number > minSalary) && (creditScore >= minCreditScore)) {
            System.out.println("Congratulations! You've got credit ");
        } else {
            System.out.println("Sorry, but we cannot give you credit ");
        }
    }
}
