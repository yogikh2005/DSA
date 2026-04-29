
import java.util.HashMap;

public class FirstReaptingNumber
{
    static int firstReaptingNumber(int iArr[])
    {
        HashMap<Integer,Integer>ht  = new HashMap<>();

        for(int no : iArr)
        {
            ht.put(no, ht.getOrDefault(no, 0)+1);
        }

        for(int no :iArr)
        {
            if(ht.get(no)>1)
            {
                return no;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6,2,1,2};
        System.err.println("First Reapting Number :"+firstReaptingNumber(arr));
    }
}