import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        // Take input from the user as how many elements he wants in the array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();

        // Define the array and its size to store elements in it
        int[] arr = new int[size];
        System.out.printf("Enter %d elements to store in the array: ", size);
        // Iterate over the array elements and take input from user to store elements
        for(int i=0; i<size; i++) {
            arr[i] = input.nextInt();
        }

        // Define a method to perform the bubble-sort
        bubbleSort(arr, size);

//        for(int i=0; i<size; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int size) {
        // We will go from n-1 to 1 in the outer loop
        for (int i= size-1; i>=1; i--) {
            // if array is already sorted, and we don't know so put a check for that
            int didSwap = 0;
            System.out.println(Arrays.toString(arr));
            // In the inner loop we will iterate from 0 to i([n-1]) - 1 (as j will have a check condition of j+1 so if wee go till 0 to i last check will go index out of bound)
            for(int j=0; j<= i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    // If swap happened then , if it didn't happen means didSwap = 0 and array is already sorted so break the loop
                    didSwap = 1;
                }
            }
            // Break the loop
            if(didSwap == 0) break;
        }
    }

}
