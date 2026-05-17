public class PeakIndexArray {

    static int peakElement(int arr[]) {

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Ascending part
                s = mid + 1;
            } else {
                // Descending part or peak
                e = mid;
            }
        }

        return s;
    }

    public static void main(String[] args) {

        int arr[] = {0, 2, 5, 3, 1};

        System.out.println("Peak Index = " + peakElement(arr));
    }
}