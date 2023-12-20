import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = sc.nextLine();
        int length = word.length();
        String reversedWord = "";
        for (int i = length - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("Reversed String: " + reversedWord);
    }
}
