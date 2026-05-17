

public class PainterProblem
{   
    public static  boolean isValidAns(int boards[],int k,int maxLength)
    {
        int painter = 1;
        int paintLength = 0;
        
        for(int i = 0;i<boards.length;i++) // 10 20 30 40 // 2  // 50 
        {
            if(paintLength+boards[i]<=maxLength)// 0 30 
                paintLength+=boards[i];

            else{
                    painter++;
                    paintLength = 0;

                    if(painter>k||boards[i]>maxLength)
                        return false;
                    else
                     paintLength +=boards[i];
            }
        }
        return true;
    }
    public static int minTime(int[] boards,int k) {

        int s = 0;
        int e = 0;
        int ans = 0;
        for(int board:boards){
            s = Math.max(s, board);
            e+=board;
        }

        while(s<=e)
        {   
            int mid = s + (e-s)/2;
            if(isValidAns(boards,k,mid))
            {   
                ans = mid;
                e = mid -1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        
        int boards[]={10,20,30,40};
        int k =2;

        System.out.println(minTime(boards, k));
    }
}