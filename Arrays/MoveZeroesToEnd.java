import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,9,2,0,0,4,5,6,0};

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] arr) {
        // Creating a temp_arrayList to store all the non-zero elements
        List<Integer> temp = new ArrayList<>();

        // Iterate on the array and store the non-zero elements,
        // in the temp_arr
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        // Add back all the non-0 elements in the same sequence from temp_arr
        for(int i = 0; i< temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        // Now iterate from temp.size() to n-1 and add 0s that will be the final array
        for(int i = temp.size(); i<arr.length; i++) {
            arr[i] = 0;
        }
    }
}
