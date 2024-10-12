/*
 Understanding Inheritance and Polymorphism in Java

In this example, we have two classes, Car and SportsCar. The SportsCar class is a subclass of Car, indicating an "is-a" relationship. This means that a sports car is a type of car.

Base Class (Car):

The Car class has private attributes color and speed.
It has a constructor to initialize these attributes and two methods, payToll and noise.
The payToll method returns a base toll value of 15, and the noise method prints "rumble" to the console.
Derived Class (SportsCar):

The SportsCar class extends Car, inheriting its attributes and methods.
It has an additional private attribute, horsePower.
The constructor of SportsCar initializes both the base class attributes using super(color, speed) and its own attribute.
It overrides the payToll method to return a toll value of 25 and the noise method to print "vroom!".

Main Class (Main):
In the main method, we create instances of both Car and SportsCar.
We demonstrate polymorphism by using a base class reference (Car cp) to refer to objects of both classes.
We call methods like payToll and noise on these objects, and the appropriate method (base or overridden) is called based on the actual type of the object.
This example illustrates how inheritance and polymorphism work in Java, allowing for code reuse and flexibility in handling different types of objects. 
  
 
 */


public class Car03 {
	
	private String color;
    private int speed;

    public Car03(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public int payToll() {
        return 15;
    }

    public void noise() {
        System.out.println("rumble");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car03 c1 = new Car03("red", 55);
        SportCar03 s = new SportCar03("red", 180, 280.0);

        System.out.println(c1.payToll()); // 15
        System.out.println(s.payToll()); // 25

        c1.noise(); // rumble
        s.noise(); // vroom!

        System.out.println("+++++++++++++");

        Car03 cp = c1;
        System.out.println(cp.payToll());
        cp.noise();

        System.out.println("+++++++++++++");

        cp = s; //although cp is an object of parent - make it point to Ref to child object
        System.out.println(cp.payToll()); // $25
        cp.noise();
        
        //s = c1; // not allowed - illegal

	}

}
