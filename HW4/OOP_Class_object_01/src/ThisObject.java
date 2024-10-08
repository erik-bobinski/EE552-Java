
public class ThisObject {
	/*
	 		/*
		 1. Reference to Current Object:
Inside an instance method or a constructor, this refers to the current object on which the method is invoked 
or the constructor is called.
		 */

	   private int x;

	    void setX(int x) {
	        // 'this' refers to the current object
	        this.x = x;
	    }

	    // 2. Avoiding Naming Conflicts (see example above)
	    // 3. Constructor Chaining
	    /*
	    In a constructor, you can use this() to call another constructor within 
	    the same class. This is known as constructor chaining.
	     */
	    
	    ThisObject() {
	        this(0); // Calls the parameterized constructor with a default value
	    }

	    ThisObject(int x) {
	        this.x = x;
	    }
	    //4. Passing the Current Object:
	    //You can pass the current object (this) as a parameter to other methods. 
	    //This is often seen when implementing builder patterns or in certain design patterns.
	    void someMethod() {
	        // Pass the current object to another method
	        anotherMethod(this);
	    }

	    void anotherMethod(ThisObject obj) {
	        // Do something with the object
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
