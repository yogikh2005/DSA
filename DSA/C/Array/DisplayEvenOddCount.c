#include<stdio.h>
#include<stdlib.h>

void DisplayEvenOddCount(int Arr[],int iSize)
{
	int iEven=0,iCnt;
	
	for(iCnt=0;iCnt<iSize;iCnt++)
	{
		if(Arr[iCnt]%2==0)
			iEven++;
	}
	printf("The count of even elements in array is %d\n",iEven);
	printf("The count of odd elements in array is %d\n",iSize-iEven);

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
	
	DisplayEvenOddCount(ptr,iSize);

	free(ptr);
	
	return 0;
}