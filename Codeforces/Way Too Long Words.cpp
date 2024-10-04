#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--){
        string str;
        getline(cin, str);
        
        int length = str.length();
        if (length > 10 ){
            cout<<str[0]<<length-2<<str[length - 1]<<endl;
        } else {
            cout<<str<<endl;
        }
    }
}
