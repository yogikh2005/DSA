import java.lang.*;

class NumberPrint {
    public void displayNumber(int i,int n) {
        if (i > n) {
            return;
        }
        displayNumber(i + 1,n);
		
		  System.out.println(i);
        
    }
}


class DisplayNumberRevers
{
    public static void main(String args[]) 
	{
        NumberPrint printer = new NumberPrint(); 
		
        printer.displayNumber(1,5); 
    }
}
