import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        // Brute force approach
        System.out.println(Arrays.toString(reverse(nums)));
    }

    public static int[] reverse(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int length = nums.length;
        for(int i = length - 1; i >= 0; i--) {
            temp.add(nums[i]);
        }
        for(int i = 0; i<length; i++) {
            nums[i] = temp.get(i);
        }
        return nums;
    }
}
