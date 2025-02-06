import java.util.Scanner;

class Month1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of months: ");
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // Read the input months
        int y = m / 12; // Calculate the number of full years
        int remainingMonths = m % 12; // Calculate the remaining months

        // Calculate total years with one decimal precision
        double totalYears = y + (remainingMonths / 12.0);

        // Print the result rounded to one decimal place
        System.out.printf("Total months: %d%n", m);
        System.out.printf("Equivalent in years: %.1f%n", totalYears);

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
