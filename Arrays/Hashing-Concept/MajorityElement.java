public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};


        int majorityElement = findMajorityEl(arr);
        System.out.println(majorityElement);
    }

    public static int findMajorityEl(int[] arr) {
        int majority = -1;
        int n = arr.length;
        int constraint = n/2;
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            max = Math.max(arr[i],max);
        }
        // Hash array
        int[] hash = new int[max+1]; // Because 0 based +1 that's why
        for(int i=0; i<arr.length; i++) {
            hash[arr[i]]++;
        }
        // Iterate over hash array to return the majority element
        for(int i=0; i<hash.length; i++) {
            if(hash[i] > constraint) {
                majority = i;
            }
        }
        return majority;
    }
}