

public class RotiParathaEKoSPOJ
 {

        private static boolean isPossible(int n,int[] rank,int minTime) {

        int parathaCount =0;
        for (int currentRank :rank) {
            
        int timeTaken = 0;
        int j = 1;

        while (timeTaken<=minTime) {
            if(timeTaken + j * currentRank<=minTime)
            {   timeTaken += j * currentRank; 
                parathaCount++;
                j++;
            } 
            else{
                break;
            }   
        }
        if(parathaCount>=n)
            return true;
        } 
        return false;
    }

    public static int minTimeToCookPratas(int n,int cook,int[] rank) {
      
        int start = 0;
        int maxRank = rank[0];

        for (int r : rank) {
            maxRank = Math.max(maxRank, r);
        }

        int end = maxRank * (n * (n + 1) / 2);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(n,rank,mid)) {
                ans = mid;
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int paratha = 8;
        int cook = 4;
        int rank[]={1,2,3,4};


        System.out.println(minTimeToCookPratas(paratha, cook,rank));
    
    }    
}