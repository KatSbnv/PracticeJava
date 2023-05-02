package methods;

/*Calculate the final total of someone's cell phone bill.
 * Allow the operator to input a plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create separate methods to calculate tax, overage fees, and final total.
 * Print the itemized bill */


import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter plan fee: ");
        double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes: ");
        double overageMinutes = scanner.nextDouble();

        double overageFee = calculateOverageFee(overageMinutes);
        double totalTaxFee = calculateTaxes(planFee, overageFee);
        double totalFee = calculateTotal(planFee, totalTaxFee, overageFee);
        printAll(planFee, overageFee, totalTaxFee, totalFee);

    }

    public static double calculateOverageFee(double overageMin) {
        double overageFee = overageMin * 0.25;
        return overageFee;
    }

    public static double calculateTaxes(double planFee, double overageFee) {
        double totalTaxFee = (planFee + overageFee) * 0.15;
        return totalTaxFee;

    }

    public static double calculateTotal(double planFee, double taxFee, double overageMinFee) {
        double totalFee = taxFee + planFee + overageMinFee;
        System.out.println("DEBUG: taxfee " + taxFee);
        System.out.println("DEBUG: totalfee " + planFee);
        return totalFee;
    }

    public static void printAll(double planFee, double ovarageMin, double taxesForMin, double total) {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", ovarageMin));
        System.out.println("Tax: $" + String.format("%.2f", taxesForMin));
        System.out.println("Total: $" + String.format("%.2f", total));

    }
}
