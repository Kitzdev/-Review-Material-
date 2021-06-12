#include <iostream>
using namespace std;

/*
    Using circular array to act as a queue.

    Head will be used to pop and tail will be used to push.
*/
class Queue
{
    public:

    int data[100];
    int head = -1;
    int tail = -1;

    bool IsEmpty()
    {
        if(head < tail)
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
            return true;

        } else
        {
            return data[head];
        }
    }

    void Push(int data)
    {
        if(head == (tail + 1) % 100)
        {
            return;
        }

        tail = (tail + 1) % 100;
        this -> data[tail] = data;
    }

    int Pop()
    {
        if((head + 1) % 100 == tail )
        {
            return -1;
        }

        int index = head;
        head = (head + 1) % 100;
        return data[head];
    }
};

int main()
{

}