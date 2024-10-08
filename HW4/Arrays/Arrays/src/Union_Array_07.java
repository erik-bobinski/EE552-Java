
import java.util.Arrays;
public class Union_Array_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays to find the union
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Find and print the union
        int[] union = findUnion(array1, array2);
        System.out.println("Union: " + Arrays.toString(union));
    }

    // Function to find the union between two arrays
    static int[] findUnion(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else if (array1[i] > array2[j]) {
                result[k++] = array2[j++];
            } else {
                result[k++] = array1[i++];
                j++;
            }
        }

        // Copy remaining elements from both arrays
        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        // Trim the result array to remove unused elements
        return Arrays.copyOf(result, k);
    }

	}


