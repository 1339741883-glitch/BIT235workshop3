import java.util.Scanner;

public class NumToLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer (0-35): ");
        int n = sc.nextInt();
        
        if (n >= 0 && n <= 9) {
            System.out.println(n);
        } else if (n >= 10 && n <= 35) {
            char letter = (char) ('A' + (n - 10));
            System.out.println(letter);
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
