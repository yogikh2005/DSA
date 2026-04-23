public class BinarySearch_CountOccurance {

    public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid -1;
            } else {
                low =mid + 1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                low =mid + 1;
                          } else {    
                ans = mid;
                high = mid -1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 30, 30, 70};
        int target = 30;
        System.out.println(upperBound(arr, target));
        System.out.println(lowerBound(arr, target));
        System.out.println(upperBound(arr, target)-lowerBound(arr, target));
    }
} 