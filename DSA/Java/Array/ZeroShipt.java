
public class ZeroShipt {

    static int[] shiftZero(int iArr[]) {
        int i = 0;
        int j = iArr.length - 1;

        while (i < j) {

            if (iArr[i] == 1 && iArr[j] == 0) {

                iArr[i] = 0;
                iArr[j] = 1;

                i++;
                j--;
            }

            if (iArr[i] == 0) {
                i++;
            }

            if (iArr[j] == 1) {
                j--;
            }

        }
        return iArr;
    }

    public static void main(String[] args) {

        int iArr[] = {0, 1, 0, 1, 1, 0, 1,1,0,0};

        int iAns[] = shiftZero(iArr);

        for (int iNo : iAns) {
            System.out.print(iNo+" ");
        }


    }
}
