import java.lang.*;

class NamePrinter {
    public void displayName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Yogiraj");
        displayName(i + 1, n);
    }
}


class RecursionDisplayName 
{
    public static void main(String args[]) 
	{
        NamePrinter printer = new NamePrinter(); 
		
        printer.displayName(1, 5); 
    }
}
