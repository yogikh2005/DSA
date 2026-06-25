class ArrayReader {
    private final int[] arr;

    public ArrayReader(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        if (index >= arr.length) {
            return Integer.MAX_VALUE;
        }
        return arr[index];
    }
}

public class UnboundedSerach
{   

    public static int serachElement(ArrayReader arr,int target) {
        
        if(arr.get(0)==target)
            return 0;
        
        int i = 1;
        while(arr.get(i)<=target)
        {
                i = i *2;
        }

        int s = i/2;
        int e = i;

        while(s<=e)
        {
            int m = s + (e-s)/2;

            if(arr.get(m)==target)
                return m;
            else if(arr.get(m)<target)
                s = m + 1;
            else
                e = m -1;
        }

        return  -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int target = 50;

        ArrayReader a = new ArrayReader(arr);

        System.out.println(serachElement(a, target));

    }
}

