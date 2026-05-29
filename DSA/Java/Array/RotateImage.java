public class RotateImage
{
    public static int[][] rotate90ClockWise(int[][] matrix,int N)
    {
        for(int i=0;i<N;i++)
        {
            for (int j = i+1; j < N; j++) {    // transpose of matrix
                int temp = matrix[i][j];  
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }        
        }

        // Step 2:reverse all rows of matrix
        for(int row=0;row<N;row++)
        {
            int startCol = 0;
            int endCol = N -1;
            while(startCol<endCol)
            {
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol ++;
                endCol --;
            }
        }
        return  matrix;
    }
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("Rotate array by 90 degree : ");
        
        int res[][] = rotate90ClockWise(arr,arr.length);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                
                System.out.print(res[i][j]+" ");
            }
                System.out.println();

        }
    }
}