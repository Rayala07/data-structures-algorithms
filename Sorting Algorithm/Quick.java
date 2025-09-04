import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {4,6,2,5};
        int low = 0;
        int high = arr.length-1;

        quickSort(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pI = partitionIndex(arr, low, high);
            quickSort(arr, low, pI - 1);
            quickSort(arr, pI + 1, high);
        }
    }

    public static int partitionIndex(int[] arr, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;

        while(i < j) {
            while(arr[i] <= arr[pivot] && i <= high - 1) {
                i++;
            }
            while(arr[j] > arr[pivot] && j >= low + 1) {
                j--;
            }
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;

        return j;
    }
}
