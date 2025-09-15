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
	
    public void InsertionSort()
    {
        int i = 0, j = 0, Selected = 0;

        for(i = 1; i < Arr.length; i++)
        { 		
			Selected = Arr[i];
			
            for(j = i-1; (j >= 0) && (Arr[j] > Selected);j--)
            {
                Arr[j+1] = Arr[j];
            }
            Arr[j+1] = Selected;
        }
    }
	
}

class InsertionSortEg
{
	public static void main(String argv[])
	{
		Sort ss=new Sort(5);
		ss.accept();
		ss.InsertionSort();
		ss.display();
	}
}