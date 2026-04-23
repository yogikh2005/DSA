
import java.util.Arrays;

class AgreesiveCows
 {

        private static boolean isPossible(int[] arr, int k, int min) {

        int cowCnt = 1;
        int lastpos =0;
       

            for(int i = 1 ;i<arr.length;i++) {

                if(arr[i]-arr[lastpos]>=min)
                {
                    lastpos = i;
                    cowCnt++;

                    if(cowCnt==k)
                        return true;
                }
              
            }
        return false;
    }

    public static int findMaxMinDistance(int[] arr, int k) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr[arr.length-1]-arr[0];
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
        int arr[]={12,34,67,90};
        int k = 2;

        System.out.println(findMaxMinDistance(arr, k));

    }    
}