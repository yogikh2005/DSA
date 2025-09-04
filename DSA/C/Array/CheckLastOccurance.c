#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
int CheckLastOccurance(int Arr[], int iSize, int iNo)
{
    int iCnt =0, iPos = -1;
    //      1           2           3
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)    // 4
        {
            iPos = iCnt;
        }
    }
    return iPos;
}

int main()
{
	int *ptr=NULL;
	int iLength=0,i=0,iValue=0,iRet=0;
	
	printf("Enter number of elemets:\n");
	scanf("%d",&iLength);
	
	ptr=(int *)malloc(iLength *(sizeof(int));
	
	
	printf("Enter the elements:\n");
	
	for(i=0;i<iLength;i++)
	{
		scanf("%d",&ptr[i]);
	}
	
	printf("Enter the elements tp findout the last occurance \n");
	scanf("%d",&iValue);
	
	iRet=ChechLastOccurance(ptr,iLength,iValue);
	if(iRet==-1)
	{
		printf("There is no %d in the array \n",iValue);
	}
	else
    {
         printf("%d is occured in the array at last index %d\n",iValue,iRet);
    }

    free(ptr);

    return 0;
}