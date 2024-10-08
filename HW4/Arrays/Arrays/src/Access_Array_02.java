import java.util.Scanner;

public class Access_Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size;
		size= input.nextInt();
		double [] salaries = new double [size];
		
		//fill array
		for (int i =0; i<salaries.length;i++) {
			System.out.println("enter salary for employee number: " + (i+1));
			salaries[i] = input.nextDouble();
		}
		
		// access and processing to find sum/average
		double sum=0, average=0;
		for (int i =0; i<salaries.length;i++) {
			sum+= salaries[i];
			
		}
		System.out.println("Sum Salaries: " + sum);
		System.out.println("Average Salaries: " + (sum/salaries.length));

	}

}
