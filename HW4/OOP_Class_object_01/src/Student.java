
public class Student {
	// Class variables
    String name;
    int age;

    // Default Constructor
    Student() {
        // Default values
        name = "John Doe";
        age = 20;
    }
    
    // Class method
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of the class Student (default constructor is called)
        Student student1 = new Student();

        // Call a method to display information
        student1.displayInfo();

	}

}
