#include <iostream>
#include <string.h> 
using namespace std;

void BoyerMoore(string text, string pattern)
{
    int textIndex, patternIndex;
    int badCharacterSkipIndex = 0;  //Bad Character rule
    int goodSuffixSkipIndex = 0;    //Good Suffix rule

    //Pattern will not match with the text
    if(pattern.length() >= text.length())
    {
        cout << "Pattern does not exist!";
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
                    cout << text << "\n";
                        
                    for(int i = 0; i < textIndex; i++)
                    {
                        cout << " ";
                    }

                    cout << pattern << "\n";
                    return;
                }

                textIndex--;
            }

        } else
        {
            while(pattern[patternIndex] != text[textIndex] && patternIndex != -1)
            {
                patternIndex--;
            }

            if(patternIndex == -1)
            {
                badCharacterSkipIndex = pattern.length();
                
            } else
            {
                badCharacterSkipIndex = (pattern.length() - 1) - patternIndex;    
            }
            
            textIndex += badCharacterSkipIndex;
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

    BoyerMoore(text, pattern);
}