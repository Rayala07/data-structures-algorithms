import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateByKplaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Enter number of shifts: ");
        int d = input.nextInt();

        // This is a brute-force approach

        // If d is > then arr.length means we need to only perform shifts for the extra number after arr.length.
        if(d > arr.length) {
            d = d % arr.length;
        }

        List<Integer> temp = new ArrayList<>();

        for(int i=0; i<d; i++) {
            temp.add(arr[i]);
        }


        // Shift elements towards left according to given d
        for( int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }

        // Put back temp elements into the array
        // Remember temp's index will be 0,1,... so you have to do mathematical calculation to get temp(0,1,2..)
        for(int i = arr.length - d; i < arr.length; i++) {
            arr[i] = temp.get(i - (arr.length - d));
        }

        System.out.println(Arrays.toString(arr));
    }
}
