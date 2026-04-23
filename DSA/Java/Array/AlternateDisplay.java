

public class AlternateDisplay
{
    static void printAlternate(int arr[])
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<=j)
        {
            if(i==j)
            {
                System.out.println(arr[i]);
            }
            else // i < j
            {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;

            }
        }
        
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        printAlternate(arr);

    }
}