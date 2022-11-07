package change_for_a_dollar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coins {
    public static int penny;
    public static int nickel;
    public static int dime;
    public static int quarter;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1");

        System.out.println("How many pennies would you like?");
        penny = Integer.parseInt(reader.readLine());

        System.out.println("How many nickels would you like?");
        nickel = Integer.parseInt(reader.readLine());

        System.out.println("How many dimes would you prefer?");
        dime = Integer.parseInt(reader.readLine());

        System.out.println("How many quarters you are ready to give?");
        quarter = Integer.parseInt(reader.readLine());

        result();

    }

    public static void result() {
        int result = receivedCoins(penny, nickel, dime, quarter);

        if (result < 100) {
            result = 100 - result;
            System.out.println("Sorry, not enough. You went under " + result + " pennies");
        } else if (result > 100) {
            result = result - 100;
            System.out.println("Oh, too much. You went over for " + result + " pennies");
        } else {
            System.out.println("Winner! You've got coins equals 1$!");
        }
    }

    public static int receivedCoins(int penny, int nickel, int dime, int quarter) {
        nickel = nickel * 5;
        dime = dime * 10;
        quarter = quarter * 25;

        return penny + nickel + dime + quarter;

    }


}
