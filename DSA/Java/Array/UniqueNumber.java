public class UniqueNumber
{   
    static int findUniqueNumber(int arr[])
    {
        int sum = 0;

        for (int no : arr) {
            sum^=no;
        }

        return sum;
    }
    public static void main(String[] args) {

       int arr[]={1,5,2,4,4,5,1};

       System.out.println("Unique Number : "+findUniqueNumber(arr)); 
    }
}