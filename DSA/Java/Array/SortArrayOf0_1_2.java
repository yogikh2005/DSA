import java.lang.*;

class SortArrayOf0_1_2
{
    static void sortArray(int arr[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high)
        {
            if (arr[mid] == 0)
            {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String argv[])
    {
        int arr[] = {0, 1, 2, 1, 2, 0, 0};
        sortArray(arr, arr.length);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
