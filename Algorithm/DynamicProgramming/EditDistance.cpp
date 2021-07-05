#include <iostream>
#include <string.h>
using namespace std;

int MinimalNumber(int a, int b, int c)
{
    if(a > b)
    {
        if(b <= c)
        {
            return b;
        } 

    } else if(a > c)
    {
        if(b >= c)
        {
            return c;
        }

    } else
    {
        return a;
    }
}

//Find edit distance or levensthein distance.
int LevenstheinDistance(string firstString, string secondString)
{
    //I will use dynamic programming table, firstString as the row and secondString as the column.
    int lengthOfTheFirstString = firstString.length();
    int lengthOfTheSecondString = secondString.length();
    int matrix[lengthOfTheFirstString + 1][lengthOfTheSecondString + 1];

    //Initialize first row.
    for(int i = 0; i <= lengthOfTheSecondString; i++)
    {
        matrix[0][i] = i;
    }

    //Initialize first column.
     for(int i = 0; i <= lengthOfTheFirstString; i++)
    {
        matrix[i][0] = i;
    }

    //Fill up the dynamic programming table
    for(int i = 1; i <= lengthOfTheFirstString; i++)
    {
        for(int j = 1; j <= lengthOfTheSecondString; j++)
        {
            
            if(firstString[i - 1] == secondString[j - 1])
            {
                matrix[i][j] = 0 + MinimalNumber(matrix[i - 1][j], matrix[i][j - 1], matrix[i - 1][j - 1]);

            } else
            {
                matrix[i][j] = 1 + MinimalNumber(matrix[i - 1][j], matrix[i][j - 1], matrix[i - 1][j - 1]);
            }
        }
    }

    return matrix[lengthOfTheFirstString][lengthOfTheSecondString];
}

int main()
{
    string firstString;
    string secondString;

    cout << "Insert first string: ";
    getline(cin, firstString);

    cout << "Insert second string: ";
    getline(cin, secondString);

    cout << "Minimum edit distance: " << LevenstheinDistance(firstString, secondString);
}