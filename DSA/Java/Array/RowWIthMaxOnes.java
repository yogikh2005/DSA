public class RowWIthMaxOnes
{

    static int getFirstIndex(int arr[][], int rowIndex) {

    int ccnt = arr[0].length;
    int ans = -1;

    if (arr[rowIndex][ccnt - 1] == 0) // last ele is 0 then 0
        return ccnt;

    int s = 0;
    int e = ccnt - 1;

    while (s <= e) {
        int m = s + (e - s) / 2;

        if (arr[rowIndex][m] == 0) { // 0 asel tar right side la move
            s = m + 1;
        }
         else {         // 1 asel mid save ani left la move
            ans = m;
            e = m - 1;
        }
    }

    return ans;
}

    static int rowWithMaxOnes(int arr[][]) {

    int rcnt = arr.length;
    int ccnt = arr[0].length;

    int maxi = -1;
    int maxRowIndex = -1;

    for (int row = 0; row < rcnt; row++)
    {

        int fi = getFirstIndex(arr, row);// 1st of 1
        int ocnt = ccnt - fi; // total -1st index 

        if (ocnt > maxi) {
            maxi = ocnt;
            maxRowIndex = row;
        }
    }

    return maxRowIndex;
}
        
        
    public static void main(String[] args) {
        int arr [][]={{0,0,0,1,1},
                      {0,0,1,1,1,},
                      {0,0,0,0,1}};

        System.out.println(rowWithMaxOnes(arr));


    }
    }