

import java.lang.*;
import java.util.*;

class ArrayX
{
	public int removeDuplicate(int iArr[])
    {   int i=0;
        for(int j=0;j<iArr.length;j++)
        {
            if(iArr[i]!=iArr[j])
            {
                iArr[i+1]=iArr[j];
                i++;
            }
        
        }
    	return i+1;
    }
}


class ArrayRemoveDuplicate
{
   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		int iSize,i;
		
		System.out.println("Enter the size of array");
		iSize=sc.nextInt();
		
		int iArr[]=new int[iSize];
		
		System.out.println("Enter the array elements");
		for(i=0;i<iSize;i++)
		{
			iArr[i]=sc.nextInt();
		}
		
	
		ArrayX aobj=new ArrayX();
		int iRet=aobj.removeDuplicate(iArr);
        System.out.println("Number of elements after removing duplicate elements: "+iRet);
        System.out.println("Array after removing duplicate elements");
        for(i=0;i<iRet;i++)
        {
            System.out.println(iArr[i]);
        }
				
		
		
	}
}