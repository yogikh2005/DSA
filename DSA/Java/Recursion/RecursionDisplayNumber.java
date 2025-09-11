import java.lang.*;

class NumberPrint {
    public void displayNumber(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        displayNumber(i + 1, n);
    }
}



class RecursionDisplayNumber 
{
    public static void main(String args[]) 
	{
        NumberPrint printer = new NumberPrint(); 
		
        printer.displayNumber(1, 5); 
    }
}

