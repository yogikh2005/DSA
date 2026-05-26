

public class RightShiptKPos
{
    static int[] rightShiptByKPos(int arr[] , int k)
    {
        int n = arr.length;

        k = k % n;

        for(int j = 0; j < k; j++) 
        {

            int last = arr[n-1];

            for(int i = n-1; i > 0; i--) 
            {
                arr[i] = arr[i-1];
            }

            arr[0] = last;
       }

    return arr;
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        System.out.println("Array After Right Shipt By 1 : ");
        for(int no : rightShiptByKPos(arr,2))
        {
            System.out.println(no);
        }
        
    }
}