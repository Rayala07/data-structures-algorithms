public class FindMIssingElement {
    public static void main(String[] args) {
        // Brute approach - T.C O(n^2) S.C O(1)
        // Check the hashing_concept folder for better approach :)
        int[] arr = {0,1,2,3,5};
        int n = 5;

        // Find the missing element from 0 to N (which is the size of the array)
//        for(int i=0; i<=n; i++) {
//            int flag = 0;
//
//            // Another loop to compare the "i" exists or not in the original array :
//            for(int j = 0 ; j < n ; j++) {
//                if(i == arr[j]) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 0) {
//                System.out.println(i);
//            }
        
        // Optimal Approach using sum1 and sum2 whose difference returns the missing element
        // Calculating the sum of "N" using mathematical formula
        int sum1 = (n * (n + 1)) / 2;
//        System.out.println(sum1);
        // Calculating sum of the elements of the array
        int sum2 = 0;
        for(var num: arr) {
            sum2 += num;
        }
//        System.out.println(sum2);

        // Subtract sum1 with sum2 to get the value of the missing element
        int missingElement = (sum1 - sum2);
        System.out.println(missingElement);

        }
    }

