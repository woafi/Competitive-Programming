#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define optimize() ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);

int main(){
    optimize();

    int n; cin >> n;
    int m; cin >> m;
    priority_queue <int> q;

    for(int i = 0; i < n; i++){
        int a; cin >> a;
        q.push(a);
    }
    int ans = 0;
    for (int i = 0; i < m; i++)
    {
        int t = q.top();
        q.pop();
        ans += t;
        int t2 = t-1;
        if (t2 != 0){
            q.push(t2);
        }
    }
    cout << ans << endl;
    
    
    return 0;
}