import java.util.Scanner;

public class functions_array_04 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size, searchid;
		size= input.nextInt();
		int [] ids = new int [size];
		
		//fill array
		fillarray(ids);
		
		//print array
		printarray(ids);
		
		System.out.println("enter the search id");
		searchid = input.nextInt();
		int returnindex = searcharray(ids,searchid);
		
		if (returnindex >=0 ) {
			System.out.println("item found");
			System.out.println("The found index is: " + returnindex);
			
		}
		else {
			System.out.println("item not found");
			
		}


	}
	
	public static void fillarray(int [] list) {
		
		for (int i =0; i<list.length;i++) {
			System.out.println("enter the numbers: " + (i+1));
			Scanner input = new Scanner(System.in);
			list[i] = input.nextInt();
		}
	}
	
	public static void printarray(int [] list) {
		
		for (int i =0; i<list.length;i++) {
			System.out.println(list[i]);
	
		}
	}
	
	public static int searcharray(int [] list, int target) {
		
		
		for (int i =0; i<list.length;i++) {
			if (list[i] == target) {
				return i;
			}
		}
		return -1;
	}
}

