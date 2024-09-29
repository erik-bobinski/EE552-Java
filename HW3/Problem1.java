import java.util.Scanner;

public class Problem1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int termCount = -1;
        double sum = 0;

        while(termCount < 0) {
            System.out.print("How many terms of the (1 / 2^n) series do you want? ");
            termCount = input.nextInt();
            if (termCount < 0) {
                System.out.println("Amount of terms must be a positive integer.");
            }
        } 

        // 1 + 1/2 + 1/4 + ... + 1/(2^n)
        for(int i = 0; i < termCount; i++) {
            sum += 1 / Math.pow(2, i);
        }
        System.out.print("The sum of the first " + termCount + " terms is " + sum + ".");
        input.close();
    }
}

