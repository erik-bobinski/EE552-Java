/*
 This code demonstrates the use of constructors in a base class and its derived class, emphasizing inheritance in Java.
Base Class (Base01):

The Base01 class contains a public integer variable x.
It has a default constructor that sets the value of x to 0 and prints a message.
The finalize method is overridden to print a message when the base object is being finalized.

Derived Class (Derived01):
The Derived01 class extends Base01, inheriting the x variable.
It introduces a private integer variable y.
The class has a default constructor that initializes y to 0 and prints a message.
Another constructor takes an integer parameter, initializes y with its value, and prints a message.
The finalize method is overridden to print a message about the derived object being finalized, including the values of x and y.
Object Creation in Main:

In the main method, an instance of Base01 (b) and two instances of Derived01 (d1, d2) are created.
The output of constructor calls and finalization messages will be displayed as objects are created and finalized.
 */


public class Base01 {
	
	public int x;

    public Base01() { //parent default constructor
        x = 0;
        System.out.println("Base default constructor");
    }
    
    //non-default constructor

    protected void finalize() {
        System.out.println("base object is dying");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //Base01 b = new Base01();       // expect to display Base default constructor
	    //Derived01 d1 = new Derived01(); // 1. call default constructor of parent class 2. call constructor of child class
	    Derived01 d2 = new Derived01(3); // 1. call default constructor of parent class 2. call constructor of child class

	    // how can we call the non-default constructor
	    // note. 1) this has to be done when you create the inheritance 2) provide all the necessary parameters that the non-default constructor expects
	    }

	}


