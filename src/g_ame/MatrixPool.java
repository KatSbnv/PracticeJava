package g_ame;

/*This program will help to count score during matrix pool */

import java.util.Scanner;

public class MatrixPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score after first move: ");
        int score = scanner.nextInt();
        System.out.println("Enter ball previous ball: ");
        int previousBall = scanner.nextInt();
        while (!(previousBall == 20)) {
            System.out.println("Enter next ball current ball: ");
            int currentBall = scanner.nextInt();
            if (previousBall < currentBall) {
                score = score * (currentBall - previousBall);
            } else {
                score = score / currentBall;

            }
            if(score == 0){
                score = currentBall;
            }
            previousBall = currentBall;

            System.out.println("Score: " + score);
        }


    }
}
