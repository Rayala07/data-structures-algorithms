import java.util.Arrays;

public class SecondHighestOccuringElement {
    public static void main(String[] args) {
        int[] arr = {4,4,5,5,6,7};

        // Call second highest occurring method
        System.out.println(secondHighestOccuring(arr));
    }

    public static int secondHighestOccuring(int[] arr) {
        // max_variable to get the maximum element from the array
        int max = 0;
        for(var num: arr) {
            max = Math.max(max, num);
        }
        // Create a hash array with the max element
        int[] hash = new int[max + 1];
        // Iterate over original array to store the count of each element in the hash[]
        for(int i=0; i<arr.length; i++) {
            hash[arr[i]]++;
        }
        // Set 4 vars to store the maxFreqElement and secondMaxFreqElement
        int maxFreq = 0;
        int maxFreqElement = 0;
        int secondMaxFreq = 0;
        int secondMaxFreqElement = 0;

        // Iterate over the hash[] to get the first-max and the second-max
        for(int i=0; i<hash.length; i++) {
            int count = hash[i];
            if(count == 0) continue;

            // Store the firstMax and secondMax
            if(count > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMaxFreqElement = maxFreqElement;

                maxFreq = count;
                maxFreqElement = i;
            }
            else if (count < maxFreq && count > secondMaxFreq) {
                secondMaxFreq = count;
                secondMaxFreqElement = i;
            }
        }
        return secondMaxFreqElement;
    }
}