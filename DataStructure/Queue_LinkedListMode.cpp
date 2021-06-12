#include <iostream>
#include <stdlib.h>
using namespace std;

//Head will be at the left side of the linked-list and tail will be at the right side.
class Queue
{
    public:

    struct node
    {
        int data;
        node *link = NULL;
    };

    node *head = (node*)malloc(sizeof(node));
    node *tail = (node*)malloc(sizeof(node));

    node* CreateNode(int data)
    {
        node* newNode = (node*)malloc(sizeof(node));
        newNode -> data = data;
        newNode -> link = NULL;
        return newNode;
    }

    bool IsEmpty()
    {
        if(head -> link == NULL && tail -> link == NULL)
        {
            return true;

        } else
        {
            return false;
        }
    }

    int Front()
    {
        if(IsEmpty())
        {
            return -1;

        } else
        {
            return tail -> link -> data;
        }
    }

    void Push(int data)
    {
        if(head -> link != NULL)
        {
            tail -> link -> link = CreateNode(data);
            tail -> link = tail -> link -> link;

        } else
        {
            head -> link = tail -> link = CreateNode(data);
        } 
    }

    int Pop()
    {
        if(IsEmpty())
        {
            return -1;
        }

        //If head and tail pointing to the same node, it means after this pop tail must be pointing to NULL
        if(head -> link == tail -> link)
        {
            tail -> link = NULL;
        }

        node *temp = head -> link;
        int tempData = temp -> data;
        head -> link = head -> link -> link;
        free(temp);
        return tempData;
    }
};

int main()
{
    
}