
public class Dog04 extends Animal_04 {
	
	 void makeSound() {
	        System.out.println("Dog barks");
	    }

	    // Method Overloading
	    void makeSound(String barkType) {
	        System.out.println("Dog barks: " + barkType);
	    }

}
