
/*
    Row = 4
    Col = 4

    A
    A B
    A B C
    A B C D
*/

#include<stdio.h>   

void Display(int iRow, int iCol)
{
    int i = 0, j = 0;
    
    if(iRow != iCol)
    {
        return;
    }
    int iChar=65;
    for(i = 1; i<= iRow; i++)
    {   
        for(j = 1; j<=i; j++)
        {
            if(j <= i)
            
            {   
                printf("%c\t",iChar);
            }
            iChar+=1;
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows\n");
    scanf("%d",&iValue1);

    printf("Enter number of columns\n");
    scanf("%d",&iValue2);

    Display(iValue1,iValue2);

    return 0;
}