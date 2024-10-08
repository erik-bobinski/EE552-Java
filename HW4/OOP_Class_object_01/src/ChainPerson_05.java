
public class ChainPerson_05 {
	
	    private String name;
	    private int age;

	    // Default constructor
	    ChainPerson_05() {
	        this("John Doe", 25); // Call the parameterized constructor with default values
	    }

	    // Parameterized constructor
	    ChainPerson_05(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display information
	    void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object using the default constructor
        ChainPerson_05 person1 = new ChainPerson_05();

        // Create another object using the parameterized constructor
        ChainPerson_05 person2 = new ChainPerson_05("Alice", 30);

        // Display information for both objects
        person1.displayInfo();
        person2.displayInfo();
		

	}

}
