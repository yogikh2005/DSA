public class Sorting
{   
    public static void bubbleSort(int arr[])
    {
        for(int i= 0;i<arr.length-1;i++)
        {
            for(int j= 0;j<(arr.length-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }   


    public static void selectionSort(int arr[]) {

        int n = arr.length;

        // Outer loop for rounds
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

        static void insertionSort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int currValue = arr[i];
            int prev = i - 1;

            // Shift elements greater than currValue to one position ahead
            while (prev >= 0 && currValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Place currValue at its correct position
            arr[prev + 1] = currValue;
        }
    }

    public static void main(String[] args) {

    int arr[] = {6,5,1,3,4};
    insertionSort(arr);

    for(int ele:arr)
        System.out.println(ele);    
    }
}