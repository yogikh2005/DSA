
import java.util.ArrayList;
import java.util.List;

public  class WaveFormPrint
{
public static List<Integer> waveDisplay(int arr[][], int m, int n) {
    List<Integer> list = new ArrayList<>();

    for (int j = 0; j < n; j++) {

        if ((j & 1) == 0) {   // even column
            for (int i = 0; i < m; i++) {
                list.add(arr[i][j]);
            }
        } else {              // odd column
            for (int i = m - 1; i >= 0; i--) {
                list.add(arr[i][j]);
            }
        }
    }

    return list;
}
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("Wave Display : ");
        for(int no : waveDisplay(arr,3,3))
        {
            System.out.println(no+" ");
        }
    }
}