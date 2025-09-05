import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,5,7,8};
        int target = 9;

        // A better approach using hashMap to find the indices
        // of the two elements that sum up to the target
        // Not the most-optimal
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // Declaring a hashMap to store the <element and its index> as pairs
        Map<Integer, Integer> mpp = new HashMap<>();

        int size = nums.length;

        // Iterate over the nums array and check for the two elements who sum up:
        for(int i=0; i<size; i++) {
            // Store the current element
            int num = nums[i];
            // Store how much more needed to sum up for target
            int moreNeeded = target - num;
            // Check in the map if moreNeeded is present ?
            if(mpp.containsKey(moreNeeded)) {
                // return the indices of (moreNeeded and current_i) as they sum up
                // the target
                return new int[]{mpp.get(moreNeeded), i};
            }
            // else store the elements and its index in the map
            mpp.put(num, i);
        }
        // if no pairs found
        return new int[]{-1,-1};
    }
}
