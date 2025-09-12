class ArrayX {
	
    public void Reverse(int i, int Arr[], int n) {
        if (i >= n / 2) {
            return;
        }
        int temp = Arr[i];
        Arr[i] = Arr[n - i - 1];
        Arr[n - i - 1] = temp;

        Reverse(i + 1, Arr, n);
    }
}

class ReverseArray {
    public static void main(String args[]) {
        ArrayX aobj = new ArrayX(); 
        int Arr[] = {1, 2, 3, 4, 5};

        aobj.Reverse(0, Arr, Arr.length);

     
        for (int x : Arr) {
            System.out.print(x + " ");
        }
    }
}
