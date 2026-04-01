#include <iostream>
using namespace std;

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node *PNODE;

class SinglyLL
{
public:
    // Characteristics

    PNODE First;
    int iCount;

    // Behaviours

    SinglyLL();

    void InsertFirst(int no);
    void InsertLast(int no);
    void InsertAtPos(int no, int ipos);

    void DeleteFirst();
    void DeleteLast();
    void DeleteAtPos(int ipos);

    void Display();
};

SinglyLL ::SinglyLL()
{
    First = NULL;
    iCount = 0;
}

//-----------------------------------------------------------------
// Function Name  : InsertFirst
// Description    : It's insert node at first position 
// Parameters     : no - data to be insert
// Return         : None
// Date           : 01/04/2026
// Author         : Yogiraj Khaladkar
//------------------------------------------------------------------
void SinglyLL ::InsertFirst(int no)
{
    // Step 1 : allocate the memory
    PNODE newn = new NODE;

    // Step 2 : Initialise node

    newn->data = no;
    newn->next = NULL;

    // Step 3 : Check if LL is empty
    if (First == NULL)
    {
        First = newn;
        iCount++;
    }
    else //  If LL contain atleast one node
    {
        newn->next = First;
        First = newn;
        iCount++;
    }
}

//-----------------------------------------------------------------
// Function Name   : InsertLast
// Description     : It's insert node at last position 
// Parameters      : no - data to be insert
// Return          : None
// Date            : 01/04/2026
// Author          : Yogiraj Khaladkar
//------------------------------------------------------------------
void SinglyLL ::InsertLast(int no)
{
    PNODE newn = new NODE;

    newn->data = no;
    newn->next = NULL;

    if (First == NULL)
    {
        First = newn;
        iCount++;
    }
    else
    {
        PNODE temp = First;

        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newn;
        iCount++;
    }
}

//-----------------------------------------------------------------
// Function Name  : InsertAtPos
// Description    : It's insert node at position
// Parameters     : no ,ipos      
//                 no - data to be insert
//                 ipos - position where to inserrt the node
// Return         : None
// Date           : 01/04/2026
// Author         : Yogiraj Khaladkar
//------------------------------------------------------------------
void SinglyLL ::InsertAtPos(int no, int ipos)
{
    if ((ipos < 1) || (ipos > iCount + 1))
    {
        cout << "Invalid position \n";
        return;
    }

    if (ipos == 1)
    {
        InsertFirst(no);
    }
    else if (ipos == iCount + 1)
    {
        InsertLast(no);
    }
    else
    {
        PNODE newn = new NODE;

        newn->data = no;
        newn->next = NULL;

        PNODE temp = First;

        for (int iCnt = 1; iCnt < ipos - 1; iCnt++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;

        iCount++;
    }
}

//-----------------------------------------------------------------
// Function Name  : DeleteFirst
// Description    : It's delete the first node of the linkedlist 
// Parameter      : None
// Return         : None
// Date           : 01/04/2026
// Author         : Yogiraj Khaladkar
//------------------------------------------------------------------
void SinglyLL ::DeleteFirst()
{
    if (First == NULL) // if iCount = 0
    {
        return;
    }
    else if (First->next == NULL) // else if (icount ==1)
    {
        delete First;
        First = NULL;
        iCount--;
    }
    else
    {
        PNODE temp = First;
        First = First->next;
        delete temp;
        iCount--;
    }
}

//-----------------------------------------------------------------
// Function Name    : DeleteLast
// Description      : It's delete the last node of the linkedlist 
// Parameters       : None
// Return           : None
// Date             : 01/04/2026
// Author           : Yogiraj Khaladkar
//------------------------------------------------------------------
void SinglyLL ::DeleteLast()
{
    if (First == NULL)
    {
        return;
    }
    else if (First->next == NULL)

    {
        delete First;
        First = NULL;
        iCount--;
    }
    else
    {

        PNODE temp = First;

        while (temp->next->next != NULL)
        {
            temp = temp->next;
        }

        delete temp->next;
        temp->next = NULL;
        iCount--;
    }
}

//-----------------------------------------------------------------
// Function Name   : DeleteAtPos
// Description     : It's delete node of position
// Parameters      : ipos - position which node to delete
// Return          : None
// Date            : 01/04/2026
// Author          : Yogiraj Khaladkar
//------------------------------------------------------------------
void SinglyLL ::DeleteAtPos(int ipos)
{
    if ((ipos < 1) || (ipos > iCount))
    {
        cout << "Invalid position" << "\n";
        return;
    }

    if (ipos == 1)
    {
        DeleteFirst();
    }
    else if (ipos == iCount)
    {
        DeleteLast();
    }
    else
    {
        PNODE temp1 = First;

        for (int iCnt = 1; iCnt < ipos - 1; iCnt++)
        {
            temp1 = temp1->next;
        }

        PNODE temp2 = temp1->next;
        temp1->next = temp2->next;

        delete temp2;
        iCount--;
    }
}

//-----------------------------------------------------------------
// Function Name   : Display
// Description     : It's diplay node of linkedlist
// Parameters      : None
// Return          : None
// Date            : 01/04/2026
// Author          : Yogiraj Khaladkar
//------------------------------------------------------------------
void SinglyLL ::Display()
{
    cout << "Elements of Linked List are : " << "\n";
    PNODE temp = First;

    while (temp != NULL)
    {
        cout << "| " << temp->data << " |->";
        temp = temp->next;
    }

    cout << "NULL" << "\n";
}

int main()
{
    SinglyLL obj;
    obj.InsertFirst(11);
    obj.InsertFirst(21);
    obj.InsertFirst(51);

    obj.InsertLast(101);
    obj.InsertLast(151);

    obj.Display();
    cout << "Number of nodes in first linkedList are " << obj.iCount << "\n";

    obj.DeleteFirst();

    obj.Display();
    cout << "Number of nodes in first linkedList are " << obj.iCount << "\n";

    obj.DeleteLast();
        obj.DeleteLast();    obj.DeleteLast();
    obj.Display();
    cout << "Number of nodes in first linkedList are " << obj.iCount << "\n";

    obj.InsertAtPos(11, 1);
    obj.InsertAtPos(51, 3);
    obj.InsertAtPos(151, 6);

    obj.Display();
    cout << "Number of nodes in first linkedList are " << obj.iCount << "\n";

    obj.DeleteAtPos(1);

    obj.Display();
    cout << "Number of nodes in first linkedList are " << obj.iCount << "\n";

    obj.DeleteAtPos(5);
    
    obj.Display();
    cout << "Number of nodes in first linkedList are " << obj.iCount << "\n";

}