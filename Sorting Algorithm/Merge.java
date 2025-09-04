import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,3};
        int low = 0;
        int high = arr.length-1;

        // Call mergeSort function it will sort the arrays
        mergeSort(arr, low, high);

        // Print the arr it will print in sorted form
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        // Base condition to exit the recursive function
        if(low >= high) return;
        // Find the mid to get two halves of the array
        int mid = (low + high) / 2;

        // Call the function again but divide it into first and second half
        mergeSort(arr, low, mid); // 1st half
        mergeSort(arr, mid+1, high); // 2nd half
        mergeElements(arr, low, mid, high); // Merge elements at each stage
    }

    public static void mergeElements(int[] arr, int low, int mid, int high) {
        /* Take a temp array to dynamically insert sorted elements in the temp_array
        and then insert them in the original array */
        List<Integer> temp = new ArrayList<>();

        // Take two pointers two compare and insert from low to high
        int left = low;
        int right = mid + 1;

        // While left <= mid AND right <= high compare and sort
        while(left<=mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If right elements are over and pointer exceeds then we need to put rest elements of left in the array
        while (left<= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If left elements are over and right elements are still present then add them to the temp array
        while(right<= high) {
            temp.add(arr[right]);
            right++;
        }

        // Anyone will run from the above two while loops
        // Now temp will be sorted so we need to add those elements to original array
        for(int i=low; i<=high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
