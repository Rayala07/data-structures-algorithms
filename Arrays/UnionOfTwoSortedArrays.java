import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4};
        int[] arr2 = {1,2,3,4,5};

        // Create a set to store only unique elements
        Set<Integer> uniques = new LinkedHashSet<>();

        for(int i=0; i<arr1.length;i++) {
            uniques.add(arr1[i]);
        }
        for(int i=0; i< arr2.length;i++) {
            uniques.add(arr2[i]);
        }

        int[] union = new int[uniques.size()];

        // You have to use only for-each loop because , no get() in set due it's unordered nature
        int i = 0;
        for(var num: uniques) {
            union[i++] = num;
        }

        System.out.println(Arrays.toString(union));
    }
}
