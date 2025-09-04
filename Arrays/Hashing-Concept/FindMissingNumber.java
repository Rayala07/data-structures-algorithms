import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        // Better Approach using hashing to store the count of each element
        // The element that has count = 0 , will be the missing element from the array
        int[] arr = {0,1,3,4,5};
        int n = 5;

//        // Find max element to create a hash array
//        int max =  -1;
//        for(var num: arr) {
//            max = Math.max(max, num);
//        }
        // Create a hash array of max + 1 size :
        int[] hash = new int[n + 1];
        // Iterate over the original array to store frequency of each element
        // we need to iterate from 0 to N proper not N - 1
        for(int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

//        System.out.println(Arrays.toString(hash));
        // Iterating over the hash array and return the index whose count == 0;
        for(int i = 0; i < hash.length; i++) {
            if(hash[i] == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
