import java.util.Arrays;

public class SecondLargest_SecondSmallest {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,56,78,78,35,45};

        // Return an array of two elements that holds the secondLargest and secondSmallest;

        System.out.println(Arrays.toString(secondLargestAndsecondSmallest(nums)));
    }

    public static int[] secondLargestAndsecondSmallest(int[] nums) {
        int secondLargest = secondLargest(nums);
        int secondSmallest = secondSmallest(nums);

        return new int[]{secondLargest, secondSmallest};
    }

    public static int secondLargest(int[] nums) {
        int largest = nums[0];
        int sLargest = -1; // If secondLargest is not present it will return -1 for non-negative numbers in the nums[]

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            } else if(nums[i] < largest && nums[i] > sLargest) {
                sLargest = nums[i];
            }
        }
        return sLargest;
    }

    public static int secondSmallest(int[] nums) {
        int smallest = nums[0];
        int sSmallest = Integer.MAX_VALUE; // Using this bcz we need to hold the biggest number and nums could hold any bigger number;

        for(var num: nums) {
            if(num < smallest) {
                sSmallest = smallest;
                smallest = num;
            } else if(num > smallest && num < sSmallest) {
                sSmallest = num;
            }
        }
        return sSmallest;
    }
}
