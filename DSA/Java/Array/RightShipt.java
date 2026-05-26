

public class RightShipt
{
    static int[] rightShiptBy1(int arr[])
    {
        int n = arr.length;
        int temp = arr[n-1];

        int i = n-1;
    
        while(i>=1)
        {
             arr[i] = arr[i-1];
             i--;
        }
        arr[0] = temp;
        return  arr;
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        System.out.println("Array After Right Shipt By 1 : ");
        for(int no : rightShiptBy1(arr))
        {
            System.out.println(no);
        }
        
    }
}