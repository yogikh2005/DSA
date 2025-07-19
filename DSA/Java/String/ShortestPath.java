import java.lang.*;
import java.util.*;

class StringX
{
	public float findShortestPath(String str)
	{	
		int x=0,y=0,x1=0,y1=0;
		str=str.toUpperCase();
		
		for(int i =0;i<str.length();i++)
		{
			
			if(str.charAt(i)=='W')
				x--;
			else if(str.charAt(i)=='E')
				x++;
			else if(str.charAt(i)=='S')
				y++;
			else 
				y--;
		}
		x1=x*x;
		y1=y*y;
		return (float)Math.sqrt(x1+y1);
	}
}

class ShortestPath
{
	public static void main(String argv[])
	{
		String str;
		float  fRes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the direction");
		str=sc.next();
		
		StringX s=new StringX();
		fRes=s.findShortestPath(str);
		
		System.out.println("The shortest path is "+fRes);
		
	}
}