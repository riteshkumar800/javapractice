#include <bits/stdc++.h>

using namespace std;


int bs(vector<int>& a, int target) {
    int l = 0, r = (int)a.size() - 1;

    while (l <= r) {

        int mid = l + (r - l) / 2;

        if (a[mid] == target)
            return mid;


        else if (a[mid] < target)

            l = mid + 1;
        else
            r = mid - 1;
    }

    return -1;
}

// int solve(int l, int r) {
//     if (l == r) {
       
//         return a[l];
//     }

//     int mid = l + (r - l) / 2;

//     int left = solve(l, mid);
//     int right = solve(mid + 1, r);

//     // Combine results
//     return left + right;
// }

vector<int> a;

int solve(int l, int r) {
    if (l == r)
        return a[l];

    int mid = l + (r - l) / 2;

    int lf = solve(l, mid);
    int rg = solve(mid + 1, r);

    return lf + rg;
}


int main() {
   

    int t;
    cin>>t;

    while (t--) {
    //    int n;
    // cin >> n;
    // vector<long long> a(n);
    // for (int i = 0; i < n; ++i) {
    //     cin >> a[i];
        
    // }
    // vector<long long> v(n);
    // for (int i = 0; i < n; ++i) {
    //     cin >> v[i];
    // }

    
    // sort(a.begin(), a.end());

   
    // for (int i = 0; i < n; ++i) {
    //     if (a[i] > v[i]) {
    //         cout<<-1<<endl;
            
    //     }
    // }

   
    // long long c = 0;
    // for (int i = 0; i < n; ++i) {
    //     for (int j = i + 1; j < n; ++j) {
    //         if (a[i] > a[j]) {
    //             c++;
    //         }
    //     }
    // }

    // cout<<c<<endl;

        int n;
        cin >> n;

        vector<long long> a(n), v(n);

        for (int i = 0; i < n; i++){

        cin >> a[i];
    }
        for (int i = 0; i < n; i++){
             cin >> v[i];
        }

        vector<int> v1(n);
        bool b = true;

        for (int i=0; i<n;i++) {
            int p = lower_bound(v.begin(), v.end(), a[i]) - v.begin();

            if (p == n) {
                b = false;
                break;
            }

            v1[i] = p + 1;
        }

        if (!b) {
            cout<<-1<<endl;
            continue;
        }

        vector<int> v2;

        vector<int> v3(n, 0);

        for (int j=1;j<=n;j++) {

            int c = -1;

            for (int i=0; i<n;i++) {
                if (!v3[i] && v1[i] <= j) {
                    c = i;
                    break; 
                }
            }

            if (c== -1) {
                b=false;
                break;
            }

            v3[c]= 1;
            v2.push_back(c + 1);
        }

        if (!b) {
            cout<<-1<<endl;
            continue;
        }

        long long d = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v2[i]>v2[j])
                    d++;
            }
        }

        cout<<d<<endl;

    
    }

   
}