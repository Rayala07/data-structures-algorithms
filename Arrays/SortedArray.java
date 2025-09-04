public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};

        // This method is a brute-force approach
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {
        if(arr.length == 1) return true;

        for(int i=0; i<arr.length; i++) {
            for(int j= i + 1; j<arr.length; j++) {
                if(arr[i] > arr[j]) return false;
            }
        }
        return true;
    }
}