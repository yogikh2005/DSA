
import java.util.HashMap;

public class HighestLowestFreq
{
    static int[] getHighestLowestFreq(int arr[])
    {       
        HashMap<Integer,Integer>ht = new HashMap<>();

        for(int no : arr)
        {
            ht.put(no,ht.getOrDefault(no, 0)+1);
        }

        int MaxFreq = Integer.MIN_VALUE;
        int MaxFreqKey = -1;

        for(int key : ht.keySet())
        {
            int currentkey = key;
            int currentkeyFreq = ht.get(key);
            
            if(currentkeyFreq>MaxFreq)
            {
                MaxFreq = currentkeyFreq;
                MaxFreqKey = currentkey;
            }
        }

        int LowFreq = Integer.MAX_VALUE;
        int LowFreqKey = -1;

        for(int key : ht.keySet())
        {
            int currentkey = key;
            int currentkeyFreq = ht.get(key);
            
            if(currentkeyFreq<LowFreq)
            {
                LowFreq = currentkeyFreq;
                LowFreqKey = currentkey;
            }
        }
        
        int freq[] = {LowFreqKey,MaxFreqKey};
        return freq;
        
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,3,2,3,2,3};
        
        int res[] = getHighestLowestFreq(arr);

        System.out.println("Lowest Frequncy no of Array : " + res[0]);

        System.out.println("Highest Frequncy no of Array : " + res[1]);

    }
}