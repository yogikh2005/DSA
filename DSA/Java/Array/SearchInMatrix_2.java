
class SearchInMatrix_2 {
    static public boolean searchMatrix(int[][] matrix, int target) {
        
        int rcnt = matrix.length;
        int ccnt = matrix[0].length;

        int row = 0;
        int col = ccnt -1;

        while(row<rcnt && col>=0)
        {
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)
                col--; // lahan ahe
            else
                row++;// large value
        }
    return false;
    }
    public static void main(String[] args) {
        
        int arr [][]={{1,4,7,11,15},
                      {2,5,8,12,19},
                      {3,6,9,16,22},
                      {10,13,14,17,24},
                      {18,21,23,26,30}};
        int target = 22;                    

        System.out.println(searchMatrix(arr, target));
    }
}