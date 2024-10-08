import java.util.Scanner;

public class numbers_even_odd_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create array of numbers - calculate the average of positive numbers
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size;
		size= input.nextInt();
		int [] numbers = new int [size];
		
		//fill array
		for (int i =0; i<numbers.length;i++) {
			System.out.println("enter the numbers: " + (i+1));
			numbers[i] = input.nextInt();
		}
		
		// access and processing to find sum/average
		double sum=0, count=0;
		for (int i =0; i<numbers.length;i++) {
			if (numbers[i] > 0) {
				sum+= numbers[i];
			}
			count++;
		}
		System.out.println("The average of positive numbes is: " + (sum/count));

	}


}


