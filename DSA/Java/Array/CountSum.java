

public class CountSum
{
    static int[] countSum(int arr[])
    {
        int ipos = 0;
        int ineg = 0;

        for(int no : arr)
        {
            if(no<0)
            {   
                ineg+=no;
            }
            else
            {
                ipos+=no;
            }
        }
        int res[]={ineg,ipos};

        return res;
    }

    public static void main(String[] args) {
        
        int arr[] = {-1,1,-2,-3,3-4,4};

        int res[] = countSum(arr);

        System.out.println("Negative number sum elements is "+res[0]+" in array");
        
        System.out.println("Positive number sum elements is "+res[1]+" in array");


    }
}