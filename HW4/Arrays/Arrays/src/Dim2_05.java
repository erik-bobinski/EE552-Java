import java.util.Scanner;

public class Dim2_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] marks = new double [2][3];
		
		System.out.println(marks.length);
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		
		
		 int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        // Access and print elements of the 2D array
		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[i].length; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();  // Move to the next line after each row
		        }
		        
		        // use functions fillarray - printarray - sumarray
		        int [][] matrix2 = new int [3][4];
		        fillarray(matrix2);
		        printarray(matrix2);
		        int x = sumarray(matrix2);
		        System.out.println("Sum of Array Matrix2 " + x);
		

	}
	
	public static void fillarray (int[][] list) {
		for (int row = 0; row<list.length;row++) {
			for(int col = 0; col < list[1].length; col++) {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Data for Row No " + row + " And column No " + col);
				list[row][col]=input.nextInt();
				
			}
		}
	}
	
	public static void printarray(int [][] list) {
		for (int row = 0; row<list.length;row++) {
			for(int col = 0; col < list[1].length; col++) {
				System.out.println(list[row][col]);
			}
		}
		
		}
	public static int sumarray(int [][] list) {
		int sum=0;
		for (int row = 0; row<list.length;row++) {
			for(int col = 0; col < list[1].length; col++) {
				sum+=list[row][col];
			}
		}
		return sum;
		
		}

}
