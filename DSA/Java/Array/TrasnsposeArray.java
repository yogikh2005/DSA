public class TrasnsposeArray
{
    public static int[][] transpose(int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length;

        int ans[][] = new int[row][col];

        for(int i =0 ;i<row;i++)
        {
            for (int j = 0; j < col; j++) {
                
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("Transpose of array : ");
        
        int res[][] = transpose(arr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                
                System.out.print(res[i][j]+" ");
            }
                System.out.println();

        }
    }
}