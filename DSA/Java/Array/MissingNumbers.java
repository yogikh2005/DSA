
import java.util.LinkedList;
import java.util.List;

public class MissingNumbers
{
    public static List<Integer> findMissingNumbers(int arr[])
    {   
        List<Integer>list = new LinkedList<>();

        int n = arr.length;

        for(int i = 0 ; i<n;i++)
        {
            int value = Math.abs(arr[i]);
            int pos = value -1;
            
            if(arr[pos]>0)
                arr[i] = -arr[pos];
        }

        for(int i =0 ;i<n;i++)
        {
            if(arr[i]>0)
            {
                list.add(i+1);
            }
        } 
        return list;
    }

    public static void main(String[] args) {
        
        int arr[]={1,4,4,5,2,2};

        List<Integer>ans = findMissingNumbers(arr);

        for (int no : ans) {
            
            System.err.print(no+" ");
        }
    }
}