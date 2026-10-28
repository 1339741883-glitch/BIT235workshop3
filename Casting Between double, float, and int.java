public class PrecisionTest {
    public static void main(String[] args) {
        // Task 1: PI precision
        double piDouble = 3.1415926535;
        float piFloat = (float) piDouble;
        System.out.println("Double PI: " + piDouble); 
        System.out.println("Float PI: " + piFloat);   
        
        // Task 2: Dollar amount with cents
        double price1 = 23.99;
        System.out.println("Price with cents: " + price1); 
        
        // Task 3: Dollar amount with zero cents
        double price2 = 23.00;
        System.out.println("Price zero cents: " + price2); 
    }
}
