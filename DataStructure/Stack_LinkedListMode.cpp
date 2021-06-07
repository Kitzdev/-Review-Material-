#include <iostream>
using namespace std;

class Stack
{
    public: 

    struct node
    {
        int data;
        node *link = NULL;
    };

    node* head = (node*)malloc(sizeof(node));

    node* CreateNode(int data)
    {
        node* newNode = (node*)malloc(sizeof(node));
        newNode -> data = data;
        newNode -> link = NULL;
        return newNode;
    }

    //Delete after head
    void Push(int data)
    {
        node* tempNode = CreateNode(data);
        tempNode -> link = head -> link;
        head -> link = tempNode;
    }

    //Insert before head
    int Pop()
    {
        if(head -> link == NULL)
        {
            return -1;
        }

        node* tempNode = head -> link;
        int tempData = tempNode -> data;
        head -> link = head -> link -> link;
        free(tempNode);
        return tempData;
    }
};

int main()
{
    Stack theStack;
    theStack.Push(5);

    cout << "Result: " << theStack.Pop();
}