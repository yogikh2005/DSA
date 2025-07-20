import java.lang.*;
import java.util.*;

class StringX
{
	public String largestString(String str[])
	{
		String largest=str[0];
		for(int i=0;i<str.length;i++)
		{
			if(largest.compareTo(str[i])<0)
				largest=str[i];
		}
		return largest;
	}
	
}

class largestStringLexicographic
{
	public static void main(String argv[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
		
        sc.nextLine(); 
        String str[] = new String[n];

       
        for (int i = 0; i < n; i++)
		{
            System.out.print("Enter string " + (i + 1) + ": ");
            str[i] = sc.nextLine();
        }

		
		StringX s=new StringX();
		String sRes=s.largestString(str);
		
		System.out.println("The largest is "+sRes);
		
	}
}