
public class toString_05 {
	
	private String name;
    private int age;

    public toString_05(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the toString() method - built-in function in java 
  
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toString_05 person = new toString_05("John", 25);

        // When you print the object, the overridden toString() method is automatically called
        System.out.println(person);

	}

}
