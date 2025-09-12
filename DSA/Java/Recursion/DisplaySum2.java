import java.lang.*;

class NumberPrint {
    public int Sum(int i) {
        if (i == 0) {
            return 0;
        }
       return (i + Sum(i-1));
	
    }
}


class DisplaySum2
{
    public static void main(String args[]) 
	{
        NumberPrint printer = new NumberPrint(); 
		
        System.out.println("Sum is"+printer.Sum(5)); 
    }
}
