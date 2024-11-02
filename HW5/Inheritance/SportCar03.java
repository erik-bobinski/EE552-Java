
public class SportCar03 extends Car03 {
	
	private double horsePower;

	public SportCar03(String color, int speed) {
		super(color, speed);
		// TODO Auto-generated constructor stub
	}
	public SportCar03(String color, int speed, double horsePower) {
	        super(color, speed);
	        this.horsePower = horsePower;
	    }
	
	@Override //not mandatory
    public int payToll() {
        return 25;
    }

    @Override
    public void noise() {
        System.out.println("vroom!");
    }

}
