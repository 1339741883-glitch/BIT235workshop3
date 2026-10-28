import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        
        double smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        
        System.out.println("Smallest: " + smallest);
        sc.close();
    }
}
