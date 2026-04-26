

public class CountElements
{
    static int[] countElements(int arr[])
    {
        int ipos = 0;
        int ineg = 0;

        for(int no : arr)
        {
            if(no<0)
            {   
                ineg++;
            }
            else
            {
                ipos++;
            }
        }
        int res[]={ineg,ipos};

        return res;
    }

    public static void main(String[] args) {
        
        int arr[] = {-1,1,-2,-3,3,-4,4};

        int res[] = countElements(arr);

        System.out.println("Negative  elements count is "+res[0]+" in array");
        
        System.out.println("Positive  elements count is "+res[1]+" in array");


    }
}