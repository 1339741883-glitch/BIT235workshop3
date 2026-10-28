import java.util.Scanner;

public class PictureFraming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Picture length (inches): ");
        double length = sc.nextDouble();
        System.out.print("Picture width (inches): ");
        double width = sc.nextDouble();
        
        // Frame perimeter (frame is 1 inch wide on each side, so add 2 to each dimension)
        double perimeter = 2 * ((length + 2) + (width + 2));
        
        System.out.print("Frame type (regular/fancy): ");
        String type = sc.next().toLowerCase();
        
        System.out.print("Color the frame? (yes/no): ");
        String colorChoice = sc.next().toLowerCase();
        
        System.out.print("Number of crowns: ");
        int crowns = sc.nextInt();
        
        double cost = 0;
        // Frame cost
        if (type.equals("fancy")) {
            cost += perimeter * 0.25;
        } else {
            cost += perimeter * 0.15;
        }
        
        // Coloring cost
        if (colorChoice.equals("yes")) {
            cost += perimeter * 0.10;
        }
        
        // Crowns cost
        cost += crowns * 0.35;
        
        System.out.printf("Total framing cost: $%.2f%n", cost);
        sc.close();
    }
}
