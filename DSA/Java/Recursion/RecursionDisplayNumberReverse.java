import java.lang.*;

class NumberPrint {
    public void displayNumber(int i) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        displayNumber(i - 1);
    }
}


class RecursionDisplayNumberReverse
{
    public static void main(String args[]) 
	{
        NumberPrint printer = new NumberPrint(); 
		
        printer.displayNumber(5); 
    }
}
