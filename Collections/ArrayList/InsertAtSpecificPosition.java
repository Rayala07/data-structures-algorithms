import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertAtSpecificPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter input size: ");
        int size = input.nextInt();

        List<Integer> nums = new ArrayList<>();
        System.out.print("Enter numbers: ");
        for(int i=0; i<size; i++) {
            int inputNumber = input.nextInt();
            nums.add(inputNumber);
        }

        // To print directly using ArrayList
         for(int i=0; i<size; i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();

        System.out.print("Enter number to insert at index 2: ");
        int num = input.nextInt();
        nums.add(2, num);

        // Gets the new size after adding number at index 2;
        int newSize = nums.size();

        int[] arr1 = new int[newSize];
        for(int i=0; i<newSize; i++) {
            arr1[i] = nums.get(i);
        }
        System.out.println(Arrays.toString(arr1));
        input.close();
    }
}
