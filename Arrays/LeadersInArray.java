import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,6};

        System.out.println(Arrays.toString(findLeaders(arr)));

    }
    public static int[] findLeaders(int[] arr) {
        // BRUTE FORCE APPROACH
        List<Integer> temp = new ArrayList<>();
        // Have to check the right elements are smaller or not
        for(int i=0; i<arr.length;i++) {
            boolean leader = true;
            for(int j= i + 1; j<arr.length; j++) {
                if(arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if(leader) {
                temp.add(arr[i]);
            }
        }
        // Convert ArrayList to Array
        int[] ans = new int[temp.size()];

        for(int i=0; i<ans.length; i++) {
            ans[i] = temp.get(i);
        }

        return ans;
    }
}
