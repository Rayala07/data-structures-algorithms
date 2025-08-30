import com.sun.source.doctree.SeeTree;
import com.sun.source.doctree.UsesTree;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        if(checkDuplicate(nums)) {
            System.out.println("Has Duplicates");
        } else {
            System.out.println("Unique Array");
        }
    }

    public static boolean checkDuplicate(int[] nums) {
        // With a help of set we will add the elements into temp
        // and simultaneously check whether the set contains the element for the next one, if so then it's a DUPLICATE array
        Set<Integer> temp = new HashSet<>();

        // Iterate over the nums[]
        // NO work with indices, so for-each loop
        for(var num: nums) {
            if(temp.contains(num)) return true;
            temp.add(num);
        }
        return false;
    }
}
