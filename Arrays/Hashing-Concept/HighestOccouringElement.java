import java.util.Arrays;

public class HighestOccouringElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};

        System.out.println(highestOccouring(arr));
    }

    public static int highestOccouring(int[] arr) {
        // Declare a max_var that will store the maxElement of the array
        // to create the hash[] array
        int maxElement = 0;
        // Iterate over the array to find max - we will use for-each as there is no work with indices
        for (var num : arr) {
            maxElement = Math.max(maxElement, num);
        }
        // Once I get the maxElement I will use it to create a hash array to store
        // frequency of each element of the array -
        int[] hash = new int[maxElement + 1];

        // Now we need to iterate over the array to store the frequencies inside hash[]
        for (int i = 0; i < arr.length; i++) {
            // hashIndex = element of the arr[] and hashElement = count of the hashIndex (element of the array)
            hash[arr[i]]++;
        }
        // Checking whether hash[] array correctly stored the count of each element or not..
        // System.out.println(Arrays.toString(hash));

        int maxCount = 0;
        int maxCountElement = 0;

        for (int i = 0; i < hash.length; i++) {
            int curr_count = hash[i];
            // if the count == 0 no need to check further so , continue with next iteration.
            if(curr_count == 0) continue;

            // Check whether the current_Count is greater than the previous max_Count
            // if TRUE then assign the index of that element to the maxCountElement,
            // as that index is the element of the array.
            if(curr_count > maxCount) {
                maxCountElement = i;
            }
        }
        return maxCountElement;
    }
}
