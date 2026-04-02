#include <iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

typedef struct node NODE;
typedef struct node *PNODE;

class DoublyLL
{
public:
    PNODE First;
    int iCount;

    DoublyLL();

    void InsertFirst(int no);
    void InsertLast(int no);
    void InsertAtPos(int no, int ipos);

    void DeleteFirst();
    void DeleteLast();
    void DeleteAtPos(int ipos);

    void Display();
    int Count();
};

DoublyLL ::DoublyLL()
{
    First = NULL;
    iCount = 0;
}

//-----------------------------------------------------------------
// Function Name : InsertFirst
// Description   : Inserts a node at the beginning of the linked list
// Parameters    : no - Data to be inserted
// Return        : None
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DoublyLL ::InsertFirst(int no)
{
    PNODE newn = new NODE;

    newn->data = no;
    newn->next = NULL;
    newn->prev = NULL;

    if (First == NULL)
    {
        First = newn;
    }
    else
    {
        newn->next = First;
        First->prev = newn;
        First = newn;
    }
    iCount++;
}

//-----------------------------------------------------------------
// Function Name : InsertLast
// Description   : Inserts a node at the end of the linked list
// Parameters    : no - data to be insert
// Return        : None
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DoublyLL ::InsertLast(int no)
{
    PNODE newn = new NODE;

    newn->data = no;
    newn->next = NULL;
    newn->prev = NULL;

    if (First == NULL)
    {
        First = newn;
    }
    else
    {
        PNODE temp = First;

        while (temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
        newn->prev = temp;
    }
    iCount++;
}

//-----------------------------------------------------------------
// Function Name : InsertAtPos
// Description   : Inserts a node at a specific position
// Parameters    : no   - Data to be inserted
//                 ipos - Position where the node should be inserted
// Return        : None
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DoublyLL ::InsertAtPos(int no, int ipos)
{
    if ((ipos < 1) || (ipos > (iCount + 1)))
    {
        cout << "Invalid the position" << "\n";
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
        PNODE temp = First;

        PNODE newn = new NODE;
        newn->data = no;
        newn->next = NULL;
        newn->prev = NULL;

        for (int iCnt = 1; iCnt < ipos - 1; iCnt++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        newn->prev = temp;
        temp->next->prev = newn;
        temp->next = newn;

        iCount++;
    }
}

//-----------------------------------------------------------------
// Function Name : DeleteFirst
// Description   : Deletes the first node of the linked list
// Parameters    : None
// Return        : None
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DoublyLL ::DeleteFirst()
{
    if (First == NULL)
    {
        return;
    }

    else if (First->next == NULL)
    {
        delete First;
        First = NULL;
    }
    else
    {
        First = First->next;
        delete First->prev;
        First->prev = NULL;
    }
    iCount--;
}

//-----------------------------------------------------------------
// Function Name : DeleteLast
// Description   : Deletes the last node of the linked list
// Parameters    : None
// Return        : None
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DoublyLL ::DeleteLast()
{
    if (First == NULL)
    {
        return;
    }
    else if (First->next == NULL)
    {
        delete First;
        First = NULL;
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
    }
    iCount--;
}

//-----------------------------------------------------------------
// Function Name : DeleteAtPos
// Description   : Deletes a node at a specific position
// Parameters    : ipos - Position of the node to be deleted
// Return        : None
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DoublyLL ::DeleteAtPos(int ipos)
{
    if ((ipos < 1) || (ipos > iCount))
    {
        cout << "Invalid position\n";
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
        PNODE temp = First;

        for (int iCnt = 1; iCnt < ipos - 1; iCnt++)
        {
            temp = temp->next;
        }

        PNODE temp2 = temp->next;

        temp->next = temp2->next;
        temp2->next->prev = temp;

        delete temp2;

        iCount--;
    }
}

//-----------------------------------------------------------------
// Function Name : Display
// Description   : Displays all nodes in the linked list
// Parameters    : None
// Return        : None
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
void DoublyLL ::Display()
{
    cout << "Elements of Linked List are : " << "\n";
    PNODE temp = First;

    while (temp != NULL)
    {
        cout << "| " << temp->data << " |<=>";
        temp = temp->next;
    }

    cout << "NULL" << "\n";
}

//-----------------------------------------------------------------
// Function Name : Count
// Description   : Returns the number of nodes in the linked list
// Paramaters    : None
// Return        : int - Number of nodes
// Date          : 02/04/2026
// Author        : Yogiraj Khaladkar
//------------------------------------------------------------------
int DoublyLL ::Count()
{
    return iCount;
}

int main()
{
    DoublyLL obj;

    obj.InsertFirst(11);
    obj.InsertFirst(21);
    obj.InsertFirst(51);

    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.InsertLast(101);
    obj.InsertLast(151);

    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.DeleteFirst();
    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.DeleteLast();
    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.InsertAtPos(11, 2);
    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.InsertAtPos(21, 5);
    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.DeleteAtPos(1);
    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.DeleteAtPos(4);
    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    obj.DeleteAtPos(2);
    obj.Display();
    cout << "Number of node in linkedlist " << obj.Count() << "\n";

    return 0;
}