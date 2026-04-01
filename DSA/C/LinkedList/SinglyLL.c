#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)
struct node
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

//-----------------------------------------------------------------
// Function Name : InsertFirst
// Description   : It's insert node at first position 
//  Parameters   : PPNODE , no
//                PPNODE - Head address
//                no - data to be insert
// Return       : None
// Date        : 25/03/2026
// Author      : Yogiraj Khaladkar
//------------------------------------------------------------------
void InsertFirst(PPNODE First,int no)
{
    PNODE newn = (PNODE)malloc(sizeof(NODE));      
    if(newn == NULL)
    {
        printf("Memory allocation failed\n");
        return;
    }

    newn->data = no;
    newn->next = NULL;
    
    // LinkedList is empty
    if(*First==NULL)
    {
        *First = newn;
    }
    // Linked is contain more than 1 node
    else
    {
        newn->next = *First;
        *First =  newn;
    }
}

//-----------------------------------------------------------------
// Function Name : InsertLast
// Description : It's insert node at last position 
//  Paramaters : PPNODE , no
//              PPNODE - Head address
//              no - data to be insert
// Return : None
// Date : 25/03/2026
// Author : Yogiraj Khaladkar
//------------------------------------------------------------------
void InsertLast(PPNODE First,int no)
{
    PNODE newn = (PNODE)malloc(sizeof(NODE));      
    if(newn == NULL)
    {
        printf("Memory allocation failed\n");
        return;
    }

    newn->data = no;
    newn->next = NULL;

    // LinkedList is empty
    if(*First==NULL)
    {
        *First = newn;
    }
    // Linked list contains at least one node
    else
    {     PNODE temp = * First;
        while (temp->next!=NULL)
        {
            temp = temp->next;
        }
        temp ->next = newn;
    }
}

//-----------------------------------------------------------------
// Function Name : InsertAtPos
// Description   : It's insert node at position
//  Parameters   : PPNODE , no ,pos
    //             PPNODE - Head address
    //             no - data to be insert
    //             pos - position where to inserrt the node
// Return : None
// Date : 25/03/2026
// Author : Yogiraj Khaladkar
//------------------------------------------------------------------
void InsertAtPos(PPNODE First,int no,int ipos)
{
    int iNodeCnt = 0, iCnt = 0;
    PNODE newn = NULL;
    PNODE temp = NULL;

    iNodeCnt = Count(*First);

    if((ipos<1)||(ipos>(iNodeCnt +1 )))
    {
        printf("Invalid position\n");
        return;
    }
    
    if(ipos==1)
    {
        InsertFirst(First,no);
    }
    else if (ipos == iNodeCnt+1)
    {
        InsertLast(First,no);
    }
    else
    {
        newn = (PNODE)malloc(sizeof(NODE));
        if(newn == NULL)
        {
            printf("Memory allocation failed\n");
            return;
        }

        newn->data = no;
        newn->next = NULL;

        temp = *First;

        for(iCnt = 1 ;iCnt<ipos-1;iCnt++)
        {
            temp = temp -> next;
        }

        newn->next = temp -> next;
        temp ->next = newn;
    }
}

//-----------------------------------------------------------------
// Function Name : DeleteFirst
// Description   : It's delete the first node of the linkedlist 
//  Parameters   : PPNODE 
//                 PPNODE - Head address
// Return        : None
// Date          : 25/03/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DeleteFirst(PPNODE First)
{   
    PNODE temp = * First;

    // LinkedList is empty
    if(*First==NULL)
    {
        return;
    }
    // LinkedList is contain 1 node
    else if((*First)->next ==NULL)
    {
        free(*First);
        *First = NULL;
    }
   // Linked list contains at least one node
    else
    {
        (*First) = (*First) -> next;
        free(temp);
    }
}

//-----------------------------------------------------------------
// Function Name : DeleteLast
// Description   : It's delete the last node of the linkedlist 
//  Parameters   : PPNODE 
//                 PPNODE - Head address
// Return        : None
// Date          : 25/03/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DeleteLast(PPNODE First)
{   
    PNODE temp = * First;

    // LinkedList is empty
    if(*First==NULL)
    {
        return;
    }
    // LinkedList is contain 1 node
    else if((*First)->next ==NULL)
    {
        free(*First);
        *First = NULL;
    }
    // Linked list contains at least one node
    else
    {   
        while (temp->next->next!=NULL)
        {
            temp = temp ->next;
        }
         // 1-100 = 2-200 = 3-Null
    
        free(temp->next);
        temp->next = NULL;
    }
}

//-----------------------------------------------------------------
// Function Name  : DeleteAtPos
// Description    : It's delete node of position
// Parameters    : PPNODE ,ipos
//                  PPNODE - Head address
//                  ipos - position which node to delete
// Return         : None
// Date           : 25/03/2026
// Author         : Yogiraj Khaladkar
//------------------------------------------------------------------
void DeleteAtPos(PPNODE First,int ipos)
{
    int iNodeCnt = 0, iCnt = 0;

    PNODE temp2 = NULL;
    PNODE temp = NULL;

    iNodeCnt = Count(*First);

    if((ipos<1)||(ipos>(iNodeCnt)))
    {
        printf("Invalid position\n");
        return;
    }
    
    if(ipos==1)
    {
        DeleteFirst(First);
    }
    else if (ipos == iNodeCnt)
    {
        DeleteLast(First);
    }
    else
    {
        temp = *First;

        for(iCnt = 1 ;iCnt<ipos-1;iCnt++)
        {
            temp = temp -> next;
        }
        temp2 = temp->next;
        temp->next = temp2 ->next;
        free(temp2); 
    }
}

//-----------------------------------------------------------------
// Function Name    : Display
// Description      : It's diplay node of linkedlist
// Parameters      : PNODE - Head data
// Return           : None
// Date             : 25/03/2026
// Author           : Yogiraj Khaladkar
//------------------------------------------------------------------
void Display(PNODE First)
{
    printf("\nElements of linked list : \n");
    
    while (First != NULL)
    {
        printf("| %d |-> ",First->data);
        First = First->next;
    }
    printf("NULL\n");
}

//-----------------------------------------------------------------
// Function Name  : Count
// Description    : It's count the node in the linkedlist
// Parameters     : PNODE - Head data
// Return         : iCount - count of node in linkedlist
// Date           : 25/03/2026
// Author         d: Yogiraj Khaladkar
//------------------------------------------------------------------
int Count(PNODE First)
{
    int iCount = 0;

    while (First != NULL)
    {   
        iCount++;
        First = First->next;
    }
    
    return iCount;
}

int main()
{
    PNODE Head = NULL;
    int iRet =  0;

    InsertFirst(&Head,21);
    InsertFirst(&Head,11);

    Display(Head);
    iRet = Count(Head);
    printf("Number of nodes are : %d\n",iRet);

    InsertLast(&Head,51);
    InsertLast(&Head,101);

    Display(Head);
    iRet = Count(Head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteFirst(&Head);

    Display(Head);
    iRet = Count(Head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteLast(&Head);

    Display(Head); 
    iRet = Count(Head);
    printf("Number of nodes are : %d\n",iRet);

    InsertAtPos(&Head,101,3);

    Display(Head); 
    iRet = Count(Head);
    printf("Number of nodes are : %d\n",iRet);

    DeleteAtPos(&Head,1);

    Display(Head); 
    iRet = Count(Head);
    printf("Number of nodes are : %d\n",iRet);
    
    DeleteAtPos(&Head,3);
    
    Display(Head); 
    iRet = Count(Head);
    printf("Number of nodes are : %d\n",iRet);

    return 0;
}

// 27000 + 16500 + 7500 = 51000