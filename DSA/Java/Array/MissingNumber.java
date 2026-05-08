public class MissingNumber
{   
    static int getMissingNumber(int arr[])
    {
        int sum = 0;

        for (int no : arr) {
            sum^=no;
        }

        for (int i = 0; i <= arr.length; i++) {
            
            sum^=i;
        }
        return sum;
    }
    public static void main(String[] args) {

       int arr[]={0,1,5,3,2,6};

       System.out.println("Missing number : "+getMissingNumber(arr)); 
    }
}