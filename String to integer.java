import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String numStr = input.nextLine();
        try {
            int num = Integer.parseInt(numStr);
            System.out.println("The integer representation of " + numStr + " is " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
