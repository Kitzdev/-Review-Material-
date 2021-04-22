#include <iostream>
#include <string.h>
#include <stdlib.h>
using namespace std;

//Node with char type data.
struct node
{
    char data[10];
    node *link = NULL;
};

//Create a new node.
node *CreateNode(char newData[])
{
    node *newNode = (node *)malloc(sizeof(node));
    newNode -> link = NULL;
    strcpy(newNode -> data, newData);

    //Return the address of the newNode.
    return newNode;
}

//Create a new linked list.
node *CreateLinkedList()
{
    bool isContinue = true;
    char newData[10];
    int counter = 1;

    node *head = (node *)malloc(sizeof(node));
    node *pointer = head;

    do
    {
        cout << "Data-" << counter << ": ";
        fgets(newData, 10, stdin);              //This fgets function read "newline" or '\n'.
        newData[strlen(newData) - 1] = '\0';    //As a sign wether the input is empty or not.

        //If the input is not empty, we create a new node.
        if(newData[0] != '\0')
        {
            pointer -> link = CreateNode(newData);
            pointer = pointer -> link;

        } else
        {
            isContinue = false;
        }

        counter++;

    } while(isContinue);
    
    return head;
}

//Print whole linked list.
void PrintLinkedList(node *head)
{
    if(head == NULL)
    {
        cout << "\nLinked list not available! Please create a linked list first!\n";
        return;

    } else if(head -> link == NULL) //This mean a linked list is created but still empty.
    {
        cout << "\nLinked list is empty! Please do insert after or create a linked list!\n";
        return;
    }

    bool isContinue = false;
    int counter = 1;
    node *pointer = head -> link;

    cout << "\nShowing All Node: \n";

    while(pointer != NULL)
    {
        cout << "Data-" << counter << ": " << pointer -> data << " --> Address: " << pointer << " --> Next node address: " << pointer -> link << "\n";

        counter++;
        pointer = pointer -> link;
    }   
}

//Insert new data after chosen data.
int InsertAfter(node *head, char searchData[], char newData[])
{
    node *pointer = head;

    if(head -> link == NULL)    //Condition when the linked list is still empty
    {
        cout << "\nlinked list is not available so this data will be initialized as the first node!\n";

        pointer -> link = CreateNode(newData);

    } else if(head != NULL)
    {
        while((strcmp(pointer -> data, searchData)) != 0)
        {
            if(pointer -> link == NULL)
            {
                return 1;   //One code means data searched not found in the linked list.
            }

            pointer = pointer -> link;
        }

        //Executed when searched data found.
        pointer -> link = CreateNode(newData);

        cout << "Insert after has completed!\n";

    } else
    {
        cout << "linked list still empty!\n";
    }

    //Zero code means the linked list is still empty
    return 0;
}

//Insert before chosen data.
int InsertBefore(node *head, char searchData[], char newData[])
{
    node *pointer = head;

    if(head -> link == NULL)    //Condition when the linked list is still empty
    {
        cout << "\nlinked list is not available so this data will be initialized as the first node!\n";

        pointer -> link = CreateNode(newData);

    } else if(head != NULL)
    {
        while(strcmp(pointer -> link -> data, searchData) != 0)
        {
            if(pointer -> link == NULL)
            {
                return 0;   //One code means data searched not found in the linked list.
            }

            pointer = pointer -> link;
        }

        //Executed when searched data found.
        pointer -> link = CreateNode(newData);

        cout << "Insert before has completed\n";

    } else
    {
        cout << "linked list still empty!\n";
    }

    //Zero code means the linked list is still empty
    return 0;
}

//Locate address of searched node.
int LocateAddress(node *head, char searchData[])
{
    node *pointer = head;

    if(head != NULL)
    {
        while(strcmp(pointer -> data, searchData) != 0)
        {
            if(pointer -> link == NULL)
            {
                return 1; //One code means data searched not found in the linked list.
            }

            pointer = pointer -> link;
        }

        //Executed when searched data found.
        cout << "Data " << searchData << " founded in address: " << pointer << " --> Next node address: " << pointer -> link << "\n";

    } else
    {
        cout << "linked list still empty!\n";
    }

    //Zero code means the linked list is still empty
    return 0;
}

//Delete selected node.
int DeleteNode(node *head, char searchData[])
{
    node *prevNode;
    node *pointer = head;

    if(pointer != NULL)
    {
        while(strcmp(pointer -> data, searchData) != 0)
        {
            if(pointer -> link == NULL)
            {
                return 1;   //One code means data searched not found in the linked list.
            }

            prevNode = pointer;
            pointer = pointer -> link;
        }

        //Executed when searched data found
        prevNode -> link = pointer -> link;
        free(pointer);
        pointer = NULL;

        cout << "Delete node has completed!\n";

    } else
    {
        cout << "linked list still empty!\n";
    }

    //Zero code means the linked list is still empty
    return 0;
}

//Reverse whole linked list.
node *ReverseList(node *head)
{
    node *pointerNode = head -> link;
    node *nextNode = head -> link -> link;
    node *prevNode = head -> link;

    pointerNode -> link = NULL;

    if(head != NULL)
    {
        /*
            Reversing process

            First, save the next node of node that will be changed.
            Second, update the link part of the node.
            Third, repeat.
        */
        while(nextNode != NULL)
        {
            pointerNode = nextNode;
            nextNode = nextNode -> link;    //Save the next node of node that will be changed.
            pointerNode -> link = prevNode;
            prevNode = pointerNode;
        }

        //Return new head -> link address.
        return pointerNode;

    } else
    {
        cout << "linked list still empty!\n";
    }
    
    //Zero code means the linked list is still empty
    return 0;
}

//Delete whole linked list.
node *DeleteLinkedList(node *head)
{
    if(head == NULL)
    {
        return head;
    }

    node *pointerNode = (node *)malloc(sizeof(node));
    pointerNode = head -> link;
        
    node *nextNode = (node *)malloc(sizeof(node));
    nextNode = head -> link;    //Variable to store the next node of deleted node.

    while(nextNode != NULL)
    {
        nextNode = nextNode -> link;
        pointerNode -> link = NULL;
        free(pointerNode);
        pointerNode = nextNode;
    }

    //Return the address of the new head -> link.
    return nextNode;
}

int main()
{
    bool isCorrect = false;
    bool isContinue = false;
    char userAnswerA;   //Save user's character type anser.
    char newData[10];
    char searchData[10];
    int userAnswerI;    //Save user's integer type answer.
    node *head = (node *)malloc(sizeof(node));

    cout << "===========================\n";
    cout << "Welcome to SLL-AllOperation\n";
    cout << "===========================\n\n";

    cout << "===== Create First Linked List =====\n";
    head = CreateLinkedList();

    do
    {
        cout << "\nChoose operation (1 - 8):\n1. Create a linked list\n2. Insert after\n3. Insert before\n4. Locate address\n5. Print linked list\n6. Delete data in linked list\n7. Reverse linked list\n8. Delete linked list\nAnswer: ";
        cin >> userAnswerI;
        cin.get();

        if(userAnswerI == 1)
        {
            do
            {
                cout << "\nPrevious linked list will be deleted!\nDo you want to create a new one? ('Y' = YES || 'N' = NO): ";
                cin >> userAnswerA;

                if(userAnswerA == 'Y' || userAnswerA == 'y')
                {
                    cin.get();
                    isCorrect = true;
                    head = DeleteLinkedList(head);
                    head = CreateLinkedList();

                } else if(userAnswerA == 'N' || userAnswerA == 'n')
                {
                    isCorrect = true;

                } else
                {
                    cout << "Your input was wrong!\n";
                }

            } while (!isCorrect);
        
        } else if(userAnswerI == 2)
        {
            PrintLinkedList(head);

            cout << "Input your target node (data): ";
            fgets(searchData, 10, stdin);
            searchData[strlen(searchData) - 1] = '\0';

            cout << "Input data for new node: ";
            fgets(newData, 10, stdin);
            newData[strlen(newData) - 1] = '\0';

            if(searchData[0] == '\0' || newData[0] == '\0')
            {
                cout << "Data inputed invalid!\n";

            } else
            {
                if(InsertAfter(head, searchData, newData))
                {
                    cout << "Target data not found!\n";
                } 
            }

        } else if(userAnswerI == 3)
        {
            PrintLinkedList(head);

            cout << "Input your target node (data): ";
            fgets(searchData, 10, stdin);
            searchData[strlen(searchData) - 1] = '\0';

            cout << "Input data for new node: ";
            fgets(newData, 10, stdin);
            newData[strlen(newData) - 1] = '\0';

            if(searchData[0] != '\0' && newData[0] != '\0')
            {
                if(InsertBefore(head, searchData, newData))
                {
                    cout << "\nTarget data not found!\n";
                }

            } else
            {
                cout << "Data inputed invalid!\n";
            }

        } else if(userAnswerI == 4)
        {
            PrintLinkedList(head);

            cout << "Input your target node (data): ";
            fgets(searchData, 10, stdin);
            searchData[strlen(searchData) - 1] = '\0';

            if(searchData[0] != '\0')
            {
                if(LocateAddress(head, searchData))
                {
                    cout << "Data searched is not available in linked list!\n";
                } 

            } else
            {
                cout << "Input data is invalid!\n";
            }

        } else if(userAnswerI == 5)
        {
            PrintLinkedList(head);

        } else if(userAnswerI == 6)
        {
            PrintLinkedList(head);

            cout << "Input your target node (data): ";
            fgets(searchData, 10, stdin);
            searchData[strlen(searchData) - 1] = '\0';

            if(searchData[0] != '\0')
            {
                if(DeleteNode(head, searchData))
                {
                    cout << "Data searched is not available in linked list\n";
                } 

            } else
            {
                cout << "Input data is invalid!\n";
            }

        } else if(userAnswerI == 7)
        {
            head -> link = ReverseList(head);

            cout << "\nlinked list has been reversed!\n";

        } else if(userAnswerI == 8)
        {
            head = DeleteLinkedList(head);

            cout << "linked list has been deleted!\n";

        } else
        {
            cout << "You input the wrong number!\n";
        }

        do
        {
            cout << "\nDo you want to do operation again? ('Y' = yes / 'N' = no): ";
            cin >> userAnswerA;

            if(userAnswerA == 'Y' || userAnswerA == 'y')
            {
                isContinue = true;
                isCorrect = true;

            } else if(userAnswerA == 'N' || userAnswerA == 'n')
            {
                isContinue = false;
                isCorrect = true;

            } else
            {
                cout << "Your input was wrong!\n";
            }

        } while (!isCorrect);
        
    } while(isContinue);

    cout << "Thank you !\nSee you next time!\n";
}