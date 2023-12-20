import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number to be printed: ");
        int numToPrint = scanner.nextInt();

        System.out.print("Max Number of times printed: ");
        int maxPrint = scanner.nextInt();

        // Call the method to print the pattern
        printPattern(numToPrint, maxPrint);
    }

    // Method to print the pattern
    static void printPattern(int num, int maxTimes) {
        // Print the upper half of the pattern
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        // Print the lower half of the pattern
        for (int i = maxTimes - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
