

public class MinElement
{
    static int minElement(int arr[])
    {
        int min = Integer.MAX_VALUE;

        for(int no : arr)
        {
            if(min>no)
            {   
                min = no;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        int res = minElement(arr);
        
         System.out.println("Minimum elements is "+res+" in array");


    }
}