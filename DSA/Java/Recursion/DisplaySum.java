import java.lang.*;

class NumberPrint {
    public void displayNumber(int i,int sum) {
        if (i < 1) {
		
		  System.out.println(sum);
            return;
        }
        displayNumber(i - 1,sum+i);
		
        
    }
}


class DisplaySum
{
    public static void main(String args[]) 
	{
        NumberPrint printer = new NumberPrint(); 
		
        printer.displayNumber(5,0); 
    }
}
