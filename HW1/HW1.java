import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Scanner object to take user input
        double celcius;

        // Loop until a valid numeric input is received
        while(true) {
            System.out.print("Enter the Celcius temperature you'd like to convert to Fahrenheit: ");
            if(userInput.hasNextDouble()) { // Prompts user input and checks if it's a numeric value
                celcius = userInput.nextDouble(); // Assigns that value if it's numeric
                break; // Exit loop if input is valid
            }
            else {
                System.out.println("Invalid input, please input a number");
                userInput.next(); // Clears the invalid input
            }
        }

        double fahrenheit = (celcius * 9/5) + 32; // Convert celcius to fahrenheit
        System.out.println("Your temperature in fahrentheit is: " + fahrenheit); 
        userInput.close();
    }
}