
public class Car {
	// Class variables
    String model;
    int year;

    // Class method
    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	        // Create an object of the class Car
	    Car mybrothercar = new Car() ;  
		Car myCar = new Car();

	        // Set values using dot notation
	        myCar.model = "Toyota";
	        myCar.year = 2022;

	        // Call a method to display information
	        myCar.displayInfo();
		

	}

}

