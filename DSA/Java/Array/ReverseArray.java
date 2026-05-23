

public class ReverseArray
{
    static int[] reverseArray(int arr[])
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<=j)
        {
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;

             i++;
             j--;
        }
        return  arr;
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        System.out.println("Array After Reverse : ");
        for(int no : reverseArray(arr))
        {
            System.out.println(no);
        }
        
    }
}