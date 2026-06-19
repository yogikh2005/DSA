
import java.util.ArrayList;
import java.util.List;


public class TwoDaimentionsArrayRowWiseSum
{
    public static List<Integer>rowsum(int arr[][])
    {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            
            int sum = 0;
            
            for(int j = 0; j < arr[0].length; j++) 
                sum+=arr[i][j];
            
            list.add(sum);
        }
        return list;
    }
    
    public static List<Integer>colsum(int arr[][])
    {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr[0].length; i++) {
            
            int sum = 0;
            
            for(int j = 0; j < arr.length; j++) 
                sum+=arr[j][i];
            
            list.add(sum);
        }
        return list;
    }

    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Row wise sum : ");
        for(int no : rowsum(arr))
        {
            System.out.println(no+" ");
        }

        
        System.out.println("Column wise sum : ");
        for(int no : colsum(arr))
        {
            System.out.println(no+" ");
        }
    }
} 