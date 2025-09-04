import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr = {1, -1, -3, -4, 2, 3};

        System.out.println(Arrays.toString(rearrangeElements(arr)));
    }

    public static int[] rearrangeElements(int[] arr) {
        int n = arr.length;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        // Now both Lists will have n/2 elements only
        // Means = pos[x,x,x] , neg[x,x,x]
        // So we need to iterate till n/2 only
        int[] ans = new int[n];
        for(int i=0; i<n/2; i++) {
            // To store at even index
            ans[2 * i] = pos.get(i);
            // To store at odd index
            ans[2 * i + 1] = neg.get(i);
        }
        return ans;
    }
}
