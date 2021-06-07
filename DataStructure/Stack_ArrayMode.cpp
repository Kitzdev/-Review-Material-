#include <iostream>
using namespace std;

//Use circular array
class Stack
{
    public:

    int data[100];
    int head = -1;

    void Push(int data)
    {
        if(head == 100)
        {
            return;
        }
        
        head++;
        this -> data[head] = data;
    }

    int Pop()
    {
        if(head == -1)
        {
            return -1;
        }

        int temp = head;
        head--;
        return data[temp];
    }
};

int main()
{
    Stack theStack;
    theStack.Push(5);

    cout << "Result: "<< theStack.Pop() << "\n";
}