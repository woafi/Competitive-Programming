#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define optimize() ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);

int main(){
    optimize();

    vector <pair <string, string>> v;
    int n; cin >> n;

    for (int i = 0; i < n; i++)
    {   
        string s, t; cin >> s >> t;
        v.push_back({s, t});
    }

    sort(v.begin(), v.end());

    int Sz = unique (v.begin(), v.end()) - v.begin();
    
    cout << Sz << endl;
    
    return 0;
}