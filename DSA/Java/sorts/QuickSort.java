import java.util.*;

public class QuickSort {

    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j)
			{
            while (arr[i] <= pivot && i <= high - 1) 
			{
                i++;
            }
            while (arr[j] > pivot && j >= low + 1)
			{
                j--;
            }
            if (i < j) 
			{
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    // QuickSort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    // Swap helper
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Before sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, n - 1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
