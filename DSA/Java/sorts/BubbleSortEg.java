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
	public void BubbleSort()
        {
            int i = 0, j = 0, temp = 0;
            boolean flag = false;

            for(i = 0; i < Arr.length;i++)
            {
                flag = false;

                for(j = 0; j < Arr.length-i-1; j++)
                {
                    if(Arr[j] > Arr[j+1])
                    {
                        temp = Arr[j];
                        Arr[j] = Arr[j+1];
                        Arr[j+1] = temp;
                        flag = true;
                    }
                }
                if(flag == false)
                {
                    break;
                }
            }
    }
	
}

class BubbleSortEg
{
	public static void main(String argv[])
	{
		Sort ss=new Sort(5);
		ss.accept();
		ss.BubbleSort();
		ss.display();
	}
}