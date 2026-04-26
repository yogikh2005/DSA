

public class EKoSPOJ
 {

        private static boolean isPossible(int[] arr, int k, int maxsize) {

        int treecut = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>maxsize)
                treecut+=(arr[i]-maxsize);

            if(treecut>=k)
                return true;
        }
        return false;
        
    }

    public static int findCutSize(int[] arr, int k) {
        //Arrays.sort(arr);

        int start = 0;

        int end = -1;
        for(int i:arr)
        {
            if(i>end)
                end =i;
        }

        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(arr, k, mid)) {
                ans = mid;
                start = mid + 1;
            }
            else 
            {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]={20,15,10,17};
        int k = 7;

        System.out.println(findCutSize(arr, k));
    
    }    
}