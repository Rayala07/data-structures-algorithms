import java.util.Arrays;

public class ShiftArrayToLeftByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        shiftByOne(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void shiftByOne(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            swap(arr, i - 1, i);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void swap(int[] arr, int a ,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
