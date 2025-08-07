#include<stdio.h>
#include<stdlib.h>

float Average(int Arr[],int iSize)
{
	int iSum=0,iCnt;
	for(iCnt=0;iCnt<iSize;iCnt++)
	{
		iSum+=Arr[iCnt];
	}
	
	return (iSum/iSize);
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
	
	iRet=Average(ptr,iSize);
	printf("The Average	of array elements is %d\n",iRet);
	
	free(ptr);
	
	return 0;
}