
import java.util.LinkedList;
import java.util.List;

public class SpiralOrder
{
    public static List<Integer> sprialOrder(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> lt = new LinkedList<>();
        int startingRow = 0;
        int endingRow = m-1;
        int startCol = 0;
        int endingCol = n-1;

        while(startingRow<=endingRow && startCol<=endingCol)
        {  
            // start row : startcol -> endcol
            for(int col = startCol;col<=endingCol;col++)
                lt.add(matrix[startingRow][col]);
            startingRow++;

            // end col : startrow -> endrow
            for(int row = startingRow;row<=endingRow;row++)
                lt.add(matrix[row][endingCol]);
            endingCol--;

            // end row : endcol ->startcol
            for(int col = endingCol;col>=startCol;col--)
                lt.add(matrix[endingRow][col]);
            endingRow--;

            // start col : endrow -> startrow 
            for(int row = endingRow;row>=startingRow;row--)
                lt.add(matrix[row][startCol]);
            startCol++;
        }
        return lt;
    }
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("Spriral print array : "+sprialOrder(arr));
        
        
    }
}