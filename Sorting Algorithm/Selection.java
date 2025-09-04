import java.util.Arrays;
import java.util.Scanner;

public class Selection {
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

        // Define a method to perform the selection-sort
        selectionSort(arr, size);

        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr, int size) {
        for(int i=0; i<=size-2; i++) {
            int minEl = i;
            for(int k=i; k<=size-1; k++) {
                if(arr[k] < arr[minEl]) {
                    minEl = k;
                }
            }
            int temp = arr[minEl];
            arr[minEl] = arr[i];
            arr[i] = temp;
        }
    }
}
