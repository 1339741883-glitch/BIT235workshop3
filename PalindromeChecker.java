import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
        
        StringBuffer sb = new StringBuffer(word);
        String reversed = sb.reverse().toString();
        
        if (word.equals(reversed)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is NOT a palindrome.");
        }
        scanner.close();
    }
}
