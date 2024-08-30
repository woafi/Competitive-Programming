#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main()
{
    int n, m;
    cin >> n >> m;

    char grid[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            cin >> grid[i][j];
        }
    }
    int i, j;
    cin >> i >> j;
    i--; j--;
    
    if (grid[i-1][j-1] != '.' && grid[i-1][j] != '.' && grid[i-1][j+1] != '.'
        && grid[i][j-1] != '.' && grid[i][j+1] != '.'
        && grid[i+1][j-1] != '.' && grid[i+1][j] != '.' && grid[i+1][j+1] != '.' ){
            cout<<"yes";
        } else {
            cout<<"no";
        }
    return 0;
}