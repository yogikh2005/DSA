class RowAndMaximumOnes { 
    public static int[] rowAndMaximumOnes(int[][] mat) {

        int maxRow = 0;
        int maxOnes = 0;

        for (int i = 0; i < mat.length; i++) {

            int count = 0;

            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxOnes) {
                maxOnes = count;
                maxRow = i;
            }
        }

        return new int[]{maxRow, maxOnes};
    }
    public static void main(String[] args) {
        
        int arr [][]={{0,1,0,1,1},
                      {0,1,1,1,1,},
                      {1,0,0,0,1}};

        int ans [] = rowAndMaximumOnes(arr);

        System.out.println("Row index "+ans[0]+" having max one "+ans[1]);

    }
}