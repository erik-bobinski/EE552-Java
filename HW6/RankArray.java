import java.util.Arrays;
import java.util.HashMap;

public class RankArray {

    public static int[] arrayRankTransform(int[] arr) {
        // create copy of arr and sort it
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // hashmap to store rank of each element
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        // build the hashmap and assign ranks
        int rank = 1;
        for (int num: sortedArr) {
            if (!rankMap.containsKey(num)) { // ignore duplicate elements
                rankMap.put(num, rank);
                rank++;
            }
        }

        // replace each element from the original array with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30, 10};
        System.out.println("Ranking array: [40, 10, 20, 30, 10]");
        
        int[] res = arrayRankTransform(arr);

        System.out.println(Arrays.toString(res));
    }

}
