class PivotIndex
{
    public static int getPivotIndex(int iArr[])
    {
        int n = iArr.length;
        int lsum[] = new int[n];
        int rsum[] = new int[n];

        lsum[0] = iArr[0];

        for(int i =1 ;i<n;i++)
        {
            lsum[i]=lsum[i-1]+iArr[i];
        } 
         
        rsum[n-1] = iArr[n-1];

        for(int i =n-2 ;i>=0;i--)
        {
            rsum[i]=rsum[i+1]+iArr[i];
        } 

        for (int i = 0; i < n; i++) {
            if(rsum[i]==lsum[i])
            {
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        
        int arr[]={1,7,3,6,5,6}; //3

        System.err.println("Pivot Index : "+getPivotIndex(arr));
    }
}