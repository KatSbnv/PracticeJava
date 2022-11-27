package loops;

/*FOR LOOP
 * Search a String to determine if it contains letter 'A'*/

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean letterFound = false;
        System.out.println("Enter line: ");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char currentLetter = string.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("There is letter 'A' in current sentence");
        } else {
            System.out.println("There isn't letter 'A' in current sentence");
        }

        scanner.close();
    }
}
