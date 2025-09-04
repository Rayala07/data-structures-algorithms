import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Brute force Approach
        // Creating an extra answer array to store rotated elements
       // T.C - O(n^2) S.C also same
        int n = arr.length;
//        int[][] ans = new int[n][n];
//
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<n; j++) {
//                ans[j][(n - 1) - i] = arr[i][j];
//            }
//        }
//
//        for(int i = 0; i < ans.length; i++) {
//            for(int j = 0; j < ans[0].length; j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }

        // OPTIMAL APPROACH
        for(int i = 0; i <= n - 2; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse Loop
        for(int i=0; i < n; i++) {
            int left = 0; int right = n - 1;
            while(left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }

        // Print the original array
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
