#include <stdio.h>
#include <stdbool.h>

bool IsArrayDuplicateElement(int arr[], int size)
{
    int i, j;
    int fre[size],f=0;
    for(i = 0; i < size; i++)
    {   f=0;
        for(j = i + 1; j < size; j++)
        {
            if(arr[i] == arr[j])
                f++;
        }
        fre[i]=f;
    }

     for(i = 0; i < size; i++)
    {   
        for(j = i + 1; j < size; j++)
        {
            if(fre[i] == fre[j] && fre[i]!=0)
                return true;
        }
    }
    return false;
}

int main()
{	
    int size = 5, i;
    int arr[size];
    bool iRes;

    printf("Enter %d numbers:\n", size);
    for(i = 0; i < size; i++)
    {	
        scanf("%d", &arr[i]);
	    
    }

    iRes = IsArrayDuplicateElement(arr, size);

    if(iRes == true)
    {			
        printf("True\n");
    }
    else
    {			
        printf("False\n");
    }
	
    return 0;
}
