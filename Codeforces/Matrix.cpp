#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main(){
    int n; cin>> n;
    int arr[n][n];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin>>arr[i][j];
        }
        
    }
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0, j = 0; i < n, j < n; i++, j++)
    {
        sum1 += arr[i][j];
    }
    
    for (int i = 0, j = n-1; i < n, j >= 0; i++, j--)
    {
        sum2 += arr[i][j];
    }

    int result = sum1 - sum2;

    if (result < 0){
        result = - result;
    }

    cout<<result<<endl;

    return 0;
}