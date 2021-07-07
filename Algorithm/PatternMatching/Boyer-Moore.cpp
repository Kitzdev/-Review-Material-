#include <iostream>
#include <string.h> 
using namespace std;

int BoyerMoore(string text, string pattern)
{
    int textIndex, patternIndex;
    int badCharacterSkipIndex = 0;  //Bad Character rule
    int goodSuffixSkipIndex = 0;    //Good Suffix rule

    //Pattern will not match with the text
    if(pattern.length() >= text.length())
    {
        return -1;
    } 

    textIndex = pattern.length() - 1; 
    
    while(text.length() - 1 >= textIndex)
    {
        cout << "go\n";

        patternIndex = pattern.length() - 1;
        
        while(patternIndex >= 0)
        {
            cout << "lets\n";
            cout << "Pattern index: " << patternIndex << " text index: " << textIndex << "\n";

            if(pattern[patternIndex] == text[textIndex])
            {
                cout << "try\n";

                patternIndex--;

                if(patternIndex == -1)
                {
                    return textIndex;
                }

                textIndex--;
                
            } else
            {
                cout << "more\n";

                while(pattern[patternIndex] != text[textIndex] && patternIndex != -1)
                {
                    patternIndex--;
                }

                if(patternIndex == -1)
                {
                    badCharacterSkipIndex = pattern.length() - 1;
                    
                } else
                {
                    badCharacterSkipIndex = (pattern.length() - 1) - patternIndex;    
                }
                
                textIndex += badCharacterSkipIndex;
            }
        }
    }

    return -1;
}

int main()
{
    string text, pattern;
    int matchIndex;

    cout << "Input the text: ";
    getline(cin, text);

    cout << "Input the pattern: ";
    getline(cin, pattern);

    matchIndex = BoyerMoore(text, pattern);

    if(matchIndex == -1)
    {
        cout << "Pattern does not exist!\n";

    } else
    {
        cout << "Pattern founded!\n";
        cout << text << "\n";

        for(int i = 0; i < matchIndex; i++)
        {
            cout << " ";
        }

        cout << pattern << "\n";
    }
}