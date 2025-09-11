import java.lang.*;

class NumberPrint {
    public void displayNumber(int i) {
        if (i < 1) {
            return;
        }
        displayNumber(i - 1);
		
        System.out.println(i);
    }
}



class RecursionDisplayNumberBacktrack
{
    public static void main(String args[]) 
	{
        NumberPrint printer = new NumberPrint(); 
		
        printer.displayNumber(5); 
    }
}

