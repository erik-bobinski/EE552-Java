
import java.util.Arrays;
public class Intersection_2Array_06 {

	public static void main(String[] args) {
		
		// Arrays to find the intersection
		//     			0  1  2  3  4
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6};

        // Find and print the intersection
        int[] intersection = findIntersection(array1, array2);
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }

    // Function to find the intersection between two arrays
    static int[] findIntersection(int[] array1, int[] array2) {
        Arrays.sort(array1);
        printarray(array1);
        Arrays.sort(array2);
        printarray(array2);

        int[] result = new int[Math.min(array1.length, array2.length)];
        int i = 0, j = 0, k = 0;

        // 0 < 5 and  0 < 4
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                result[k++] = array1[i];
                i++;
                j++;
            }
        }

        // Trim the result array to remove unused elements
        return Arrays.copyOf(result, k);
    }
    
	public static void printarray(int [] list) {
		
		for (int i =0; i<list.length;i++) {
			System.out.println(list[i]);
	
		}
	}

		

}

