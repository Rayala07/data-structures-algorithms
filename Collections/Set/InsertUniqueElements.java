import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InsertUniqueElements {
    public static void main(String[] args) {
        // For a given array, print only unique elements . order not neccesaru
        int[] arr = {1,1,2,2,2,3,4};

        // To store only unique elements we can use a 'HASHSET'
        Set<Integer> temp = new HashSet<>();

        // Iterate over the array and add elements , it will accept only unique ones
        for(var num: arr) {
            temp.add(num);
//            System.out.println(temp);
        }

        // Will print only [1,2,3,4]
        // Now we need to return the number of unique elements
        int size = temp.size();

        int i = 0;
        // Add back the unique ones in the beginning of the array
        for(var num: temp) {
            arr[i] = num;
            i++;
        }

        System.out.println(Arrays.toString(arr));

        // This will return the number of unique elements in the array
        System.out.println(size);

    }
}
