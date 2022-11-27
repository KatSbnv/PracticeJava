package loops;
/* Find the average test scores for each student in the class.
 * There are 24 students and 4 tests */

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 24; i++) {
            double total = 0;

            for (int j = 0; j < 4; j++) {
                System.out.println("Enter score for Test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            System.out.println("Average score for student #" + (i + 1) + " is " + total/4);
        }

        scanner.close();
    }
}
