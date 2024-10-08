import java.util.Scanner;

public class Problem2 {

    public static long factorial(long n) {
        if (n < 0) { // base case
            return -1;
        }
        else if (n == 0 || n == 1) { // base case
            return 1;
        }
        else {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============================================================================================================");
        System.out.print("This program approximates e^x using Taylor Series Expansion. Enter the value of x (any real number): ");
        double x = input.nextDouble();
        
        // input validation
        int n = -1;
        while(n < 0) {
            System.out.print("Enter the amount of terms for the approximation; more terms means more accuracy: ");
            n = input.nextInt();
            if (n < 0) {
                System.out.println("Must be a positive integer amount of terms");
            }
        }
       
        // 1 + (x / 1!) = (x^2 / 2!) + (x^3 / 3!)
        double sum = 0;
        for (double i = 0; i < n; i++) {
            sum += Math.pow(x, i) / factorial( (long) i); // x^i / (i!)
        }
        System.out.println("The result of the Taylor Series Approximation of e^x is: " + sum + ".");
        System.out.print("============================================================================================================");

        input.close();
    }
}
