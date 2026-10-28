 public class SquareExercises {
    public static void main(String[] args) {
        // 4A: Sum of squares of first 100 integers
        long sumSquares = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquares += i * i;
        }
        System.out.println("Sum of squares (1-100): " + sumSquares);
        
        // 4B: Perfect squares between 1 and 100
        System.out.print("Perfect squares: ");
        for (int i = 1; i <= 100; i++) {
            double sqrt = Math.sqrt(i);
            if (sqrt == Math.floor(sqrt)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
