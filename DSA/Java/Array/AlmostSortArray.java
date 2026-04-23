

public class AlmostSortArray
{
    static int serachElement(int arr[],int k)
    {
        int n = arr.length;

        int s = 0;
        int e = n-1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            
            if(mid-1 >0 && arr[mid-1]==k)
                return mid-1;
            
            if(arr[mid]==k)
                return mid;
                
            if(mid+1<n && arr[mid+1]==k)
                return mid+1;
            
            if(k>arr[mid])
                s = mid+2;
            else
                e = mid-2;
        }
        return  -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {11,51,21,121,100,151};

        System.out.println("Almost sorted array serach :"+serachElement(arr,51));
        
    }
}