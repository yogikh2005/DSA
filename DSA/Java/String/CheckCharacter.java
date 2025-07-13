import java.lang.*;
import java.util.*;
class StringX
{
	
	public boolean IsCharacterPresent(String str,char ch)
	{			
			 str=str.toLowerCase();
			 ch=Character.toLowerCase(ch);
			 
			 for(int i=0;i<str.length();i++)
			 {
				 if(str.charAt(i)==ch)
				 {
					return true;
				 }
			 }
			 
			 return false;
			
	}
}

class CheckCharacter
{
	public static void main(String argv[])
	{
		boolean bRes=false;
		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		StringX st=new StringX();
		
		bRes=st.IsCharacterPresent(str,ch);
		
		if(bRes)
		{
			System.out.println("Character is present in the string");
		}
		else
		{
			System.out.println("Character is not present in the string");
		}
		
		
	}
}