#include <stdio.h>
#include <stdbool.h>

bool IsArrayDuplicateElement(int arr[], int size)
{
    int i, j;
    for(i = 0; i < size; i++)
    {
        for(j = i + 1; j < size; j++)
        {
            if(arr[i] == arr[j])
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
        printf("Array contains duplicate elements\n");
    }
    else
    {			
        printf("Array does not contain duplicate elements\n");
    }
	
    return 0;
}
