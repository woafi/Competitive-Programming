#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define optimize() ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);

int main(){
    optimize();

        int n; cin >> n;
        vector <string> v;
        map<string, int> m;
        for (int i = 0; i < n; i++)
        {
            string s; 
            cin >> s;
            // v.push_back(s);
            m[s]++;
            if (m[s] >= 2){
                cout<<"YES"<<endl;
            }else {
                cout<<"NO"<<endl;
            }
        }

        
        // for (auto u : v){
        //     m[u]++;
        // }

        // for (auto u : v)
        // {
        //     if (m[u] >= 2){
        //         cout<<"YES"<<endl;
        //     }else {
        //         cout<<"NO"<<endl;
        //     }
        // }
        

    return 0;
}