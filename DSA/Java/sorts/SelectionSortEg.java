import java.lang.*;
import java.util.*;

class ArrayX
{
	protected int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr=new int[iSize];
	}
	
	protected void accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the "+Arr.length+" elements");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println("Enter the elements "+(i+1));
			Arr[i]=sobj.nextInt();
		}
	}
	
	
	protected void display()
	{
		System.out.println("Array elements :");
		
		for(int i=0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+"\t");
		
		}
		System.out.println();
	}
	
	
}

class Sort extends ArrayX
{
	public Sort(int iSize)
	{
		super(iSize);
	}
	public void selectionSort()
	{
		for (int i = 0; i < Arr.length - 1; i++) 
		{
			int min = i;

			for (int j = i + 1; j < Arr.length; j++)
				{
					if (Arr[j] < Arr[min]) 
					{
						min = j;
					}
				}

     
			int temp = Arr[min];
			Arr[min] = Arr[i];
			Arr[i] = temp;
    }
	}
}

class SelectionSortEg
{
	public static void main(String argv[])
	{
		Sort ss=new Sort(5);
		ss.accept();
		ss.selectionSort();
		ss.display();
	}
}