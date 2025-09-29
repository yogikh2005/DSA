import java.lang.*;
import java.util.*;
public class LinerSearch {

    public static int search(int no, int[] a) {
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==no)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {

        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};

        System.out.println("Enter the number to search:");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        int result = search(no, arr);
        if (result == -1)
        {
            System.out.println("Element not found in the array");
        } 
        else
        {
            System.out.println("Element found at index: " + result);
        }
    }
}