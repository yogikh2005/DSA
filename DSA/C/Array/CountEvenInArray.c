#include<stdio.h>
#include<stdlib.h>

int CountEven(int Arr[],int iSize)
{
	int iEven=0,iCnt;
	for(iCnt=0;iCnt<iSize;iCnt++)
	{
		if(Arr[iCnt]%2==0)
			iEven++;
	}
	
	return iEven;
}



int main()
{
	int *ptr=NULL;
	int iSize,iCnt,iRet;
	printf("Enter the size of array\n");
	scanf("%d",&iSize);
	
	ptr=(int *)malloc(iSize*sizeof(int));
	
	printf("Enter the array elements\n");
	for(iCnt=0;iCnt<iSize;iCnt++)
	{
		scanf("%d",&ptr[iCnt]);
	}
	
	iRet=CountEven(ptr,iSize);
	printf("The count of even elements in array is %d\n",iRet);
	
	free(ptr);
	
	return 0;
}