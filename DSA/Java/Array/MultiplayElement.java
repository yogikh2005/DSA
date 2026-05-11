

public class MultiplayElement
{
    static int[] MultiplyEachElement(int arr[])
    {
        int res[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i]= arr[i]*10; 
        }
        return res;
        
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        System.err.print("Array : [");

        for(int i : MultiplyEachElement(arr))
        {
            System.err.print(i+",");
        }
        System.err.print("]");
    }
}