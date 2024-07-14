#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    int n, m; cin>> n>>m;
    int arr[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin>>arr[i][j];
        }
        
    }
    int search_numb;
    cin>>search_numb;
    int chk = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            
            if(arr[i][j] == search_numb){
                chk++;
            }
        }    
    }

    if (chk > 0){
        cout<< "will not take number"<<endl;
            } else {
                cout<<"will take number"<<endl;
            }
    
    return 0;
}