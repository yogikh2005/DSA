

public class AvgOfElement
{
    static int averageOfElement(int arr[])
    {
        int avg = 0;
        for(int i:arr)
        {
            avg+=i;
        }
        return (avg/arr.length);
        
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151};

        System.err.println("Avg of array "+averageOfElement(arr));

    }
}