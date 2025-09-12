<<<<<<< HEAD


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

=======
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
>>>>>>> 5dd7bc0 (11/9/25)
