#include <iostream>
#include <cstring>
using namespace std;


int main(){
    char str[1000000];

    cin>> str;
    int sum = 0;
    int length = strlen(str);
    for (int i = 0; i < length; i++)
    {
        sum += str[i] - '0';
    }
    
    cout<<sum<<endl;

    return 0;
}