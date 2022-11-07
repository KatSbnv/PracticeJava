package loops;

import java.io.IOException;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws IOException {
        int rate = 15;
        int maxHours = 40;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter work hours: ");
        int workHours = scanner.nextInt();

        while (workHours > 0) {
            if (workHours < maxHours) {
                int salary = workHours * rate;
                System.out.println("Salary is: " + salary + " dollars");
            } else {
                System.out.println("Overtimes are deprecated. You entered " + workHours + ", but it should be" +
                        " no more than 40 hours per week");
            }
            workHours = scanner.nextInt();
        }
        scanner.close();
    }
}


