#include <iostream>
#include <string.h> 
using namespace std;

int BadCharacterRule(string text, string pattern, int textIndex, int patternIndex)
{
    while(pattern[patternIndex] != text[textIndex] && patternIndex != -1)
    {
        patternIndex--;
    }

    if(patternIndex == -1)
    {
        return pattern.length();
        
    } else
    {
        return (pattern.length() - 1) - patternIndex;    
    }
}

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
        patternIndex = pattern.length() - 1;

        if(pattern[patternIndex] == text[textIndex])
        {
            while(pattern[patternIndex] == text[textIndex])
            {
                patternIndex--;

                if(patternIndex == -1)
                {      
                   return textIndex;
                }

                textIndex--;
            }

        } else
        {
            badCharacterSkipIndex = BadCharacterRule(text, pattern, textIndex, patternIndex);
        }
    }
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

    if(matchIndex != -1)
    {
        cout << "Pattern founded!\n" << text << "\n";
            
        for(int i = 0; i < matchIndex; i++)
        {
            cout << " ";
        }

        cout << pattern << "\n";

    } else
    {
        cout << "Pattern not founded!\n";
    }
}