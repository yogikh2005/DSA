

public class MaxElement
{
    static int maxElement(int arr[])
    {
        int max = Integer.MIN_VALUE;

        for(int no : arr)
        {
            if(max<no)
            {   
                max = no;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        int res = maxElement(arr);
        
         System.out.println("Maximum elements is "+res+" in array");


    }
}