
import java.util.HashMap;



public class ModOfArray
{
    static int getMod(int arr[])
    {       
        HashMap<Integer,Integer>ht = new HashMap<>();

        for(int no : arr)
        {
            ht.put(no,ht.getOrDefault(no, 0)+1);
        }

        System.out.println(ht);

        int MaxFreq = -1;
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

        return MaxFreqKey;
        
    }

    public static void main(String[] args) {
        
        int arr[] = {11,21,51,101,121,151,11};

        System.out.println("Mod of Array : " + getMod(arr));

    }
}