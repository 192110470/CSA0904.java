import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a line
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        // Count and print special characters
        int specialCharCount = 0;
        System.out.println("Special characters in the line:");

        for (char c : inputLine.toCharArray()) {
            if (isSpecialCharacter(c)) {
                System.out.print(c + " ");
                specialCharCount++;
            }
        }

        // Print the total count of special characters
        System.out.println("\nNumber of special characters: " + specialCharCount);
    }

    private static boolean isSpecialCharacter(char c) {
        // Check if the character is a special character
        return !Character.isLetterOrDigit(c) && !Character.isWhitespace(c);
    }
}
