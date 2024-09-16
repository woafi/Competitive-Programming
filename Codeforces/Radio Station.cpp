#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define optimize() ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);

int main(){
    optimize();

        int n; cin >> n;
        int t;
        cin >> t;
        vector<pair<string, string>> v;
        for (int i = 0; i < n; i++)
        {   
            string a, b;
            cin >> a >> b;
            v.push_back({a, b});
        }

        
        while (t--){
            string a, b;
            cin >> a >> b;
            b.pop_back();
            for (auto u : v){
                if (u.second == b){
                    cout << a <<" "<< b <<";"<<" "<<"#"<<u.first<<endl;
                }
            }
        }

    return 0;
}