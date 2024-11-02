
public class Animal_04 {
	
	 void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_04 genericAnimal = new Animal_04();
        Dog04 myDog = new Dog04();

        // Method Overriding
        genericAnimal.makeSound(); // Output: Animal makes a sound
        myDog.makeSound(); // Output: Dog barks

        // Method Overloading
        myDog.makeSound("Loud"); // Output: Dog barks: Loud
    }

	}


