import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Greeting based on hour
        System.out.print("Enter hour (1-24): ");
        int hour = sc.nextInt();
        if (hour < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }
        
        // 2. Multiples of 5 between 10 and 95
        int num = 10;
        while (num <= 95) {
            System.out.println(num);
            num += 5;
        }
        
        // 3. Sum 1 to 10
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
        
        sc.close();
    }
}
